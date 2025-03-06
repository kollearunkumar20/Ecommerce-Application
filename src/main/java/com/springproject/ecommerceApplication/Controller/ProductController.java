package com.springproject.ecommerceApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductJpaService productJpaService;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private AuthenticationManager authenticationManager;

    // Get all products
    @GetMapping("/")
    public List<Product> getAllProducts(
        @RequestParam(required = false) String sort_by,
        @RequestParam(required = false) Integer category,
        @RequestParam(required = false) String title_search,
        @RequestParam(required = false) Integer rating) {
        return productJpaService.getProducts(sort_by, category, title_search, rating);
    }

    // Get product by ID
    @GetMapping("/{id}")
    public ResponseEntity<ProductSummary> getProductById(@PathVariable Long id) {
        ProductSummary product = productJpaService.getProductById(id);
        return product != null ? ResponseEntity.ok(product) : ResponseEntity.notFound().build();
    }

    // Login endpoint
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        System.out.println("Attempting login for user: " + user.getUsername());

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));

        if (authentication.isAuthenticated()) {
            String token = jwtService.generateToken(user.getUsername());
            return ResponseEntity.ok(token);
        } else {
            return ResponseEntity.status(401).body("Login Failed");
        }
    }
}
