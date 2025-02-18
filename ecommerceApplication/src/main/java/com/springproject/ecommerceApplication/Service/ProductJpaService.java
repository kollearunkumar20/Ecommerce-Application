package com.springproject.ecommerceApplication;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductJpaService implements ProductRepository {

    private static final Logger logger = LoggerFactory.getLogger(ProductJpaService.class);

    @Autowired
    private ProductJpaRepository productJpaRepository;

    public ArrayList<Product> getProducts() {
        try {
            return new ArrayList<>(productJpaRepository.findAll());
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Products not found", e);
        }
    }

    public Product getProductById(Long id) {
        return productJpaRepository.findById(id).orElseThrow(() -> 
            new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found with ID: " + id));
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
