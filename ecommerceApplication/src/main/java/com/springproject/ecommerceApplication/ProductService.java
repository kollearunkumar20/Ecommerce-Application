package com.springproject.ecommerceApplication;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private static final Logger logger = LoggerFactory.getLogger(ProductService.class);

    @Autowired
    private ProductRepository productRepository;

    public void saveProductsFromJson(String jsonData) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(jsonData);
            JsonNode productsNode = rootNode.get("products");

            if (productsNode != null && productsNode.isArray()) {
                List<Product> productList = new ArrayList<>();
                for (JsonNode node : productsNode) {
                    Product product = objectMapper.treeToValue(node, Product.class);
                    String json = objectMapper.writeValueAsString(product);
                    System.out.println(json);
                    productList.add(product);
                    System.out.println(product);
                }

                if (!productList.isEmpty()) {
                    productRepository.saveAll(productList);
                    logger.info("Products saved successfully!");
                } else {
                    logger.warn("No products found in the JSON data.");
                }
            } else {
                logger.warn("Invalid JSON structure: 'products' node is missing or not an array.");
            }
        } catch (Exception e) {
            logger.error("Error while saving products from JSON", e);
        }
    }
}
