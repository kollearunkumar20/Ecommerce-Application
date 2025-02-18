package com.springproject.ecommerceApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/arunTrendz/products") // Base URL for product-related APIs
public class ProductController {
    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
    @Autowired
    private ProductJpaService productJpaService;

    // Get all products
    @GetMapping("/")
    public List<Product> getAllProducts() {
        return productJpaService.getProducts();
    }

    // Get product by ID
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productJpaService.getProductById(id);
    }

}
