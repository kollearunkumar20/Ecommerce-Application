package com.springproject.ecommerceApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductJpaService implements ProductRepository {

    private static final Logger logger = LoggerFactory.getLogger(ProductJpaService.class);

    @Autowired
    private ProductJpaRepository productJpaRepository;

 
    public ArrayList<Product> getProducts(String sortBy, Integer category, String titleSearch, Integer rating) {
        Sort sort = Sort.unsorted(); // Default: No sorting

        if (sortBy != null) {
            switch (sortBy.toLowerCase()) {  // Case-insensitive matching
                case "price_low":
                    sort = Sort.by(Sort.Direction.ASC, "price");
                    break;
                case "price_high":
                    sort = Sort.by(Sort.Direction.DESC, "price");
                    break;
                case "rating":
                    sort = Sort.by(Sort.Direction.DESC, "rating");
                    break;
                default:
                    logger.warn("Invalid sortBy value: {}", sortBy);
                    break; // Ignore invalid values
            }
        }

        try {
            Pageable pageable = PageRequest.of(0, Integer.MAX_VALUE, sort); // Allow sorting

            ArrayList<Product> products;
            if (category == null && titleSearch == null && rating == null) {
                products = new ArrayList<>(productJpaRepository.findAll(sort));
            } else {
                products = new ArrayList<>(productJpaRepository.findProducts(category, titleSearch, rating, pageable));
            }

            if (products.isEmpty()) {
                throw new ResponseStatusException(HttpStatus.NO_CONTENT, "No products available");
            }
            
            return products;

        } catch (Exception e) {
            logger.error("Error fetching products", e);
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error fetching products", e);
        }
    }

    public ProductSummary getProductById(Long id) {
        Product product = productJpaRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found with ID: " + id));

        Pageable pageable = PageRequest.of(0, 3); // Get 3 similar products
        List<SimilarProduct> similarProducts = productJpaRepository.findSimilarProducts(
                product.getCategory().getCategoryid(), id, pageable
        );

        return new ProductSummary(
                product.getId(), product.getImageurl(), product.getName(), product.getPrice(),
                product.getBrand(), product.getRating(), product.getDescription(), similarProducts
        );
    }

    public Product addProduct(Product product) {
        return productJpaRepository.save(product);
    }

    public void deleteProduct(Long id) {
        if (!productJpaRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found with ID: " + id);
        }
        productJpaRepository.deleteById(id);
    }

    public Product updateProduct(Long id, Product product) {
        if (!productJpaRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found with ID: " + id);
        }
        return productJpaRepository.save(product);
    }
}
