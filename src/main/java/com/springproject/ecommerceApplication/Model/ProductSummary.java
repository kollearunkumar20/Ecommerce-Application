package com.springproject.ecommerceApplication;

import jakarta.persistence.*;
import java.util.List;

public class ProductSummary {
    private Long id;
    private String imageUrl;
    private String name;
    private double price;
    private String brand;
    private double rating;
    private String description;
    private List<SimilarProduct> similarProducts;

    // Constructor
    public ProductSummary(Long id, String imageUrl, String name, double price, String brand, double rating, String description, List<SimilarProduct> similarProducts) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.rating = rating;
        this.description = description;
        this.similarProducts = similarProducts;
    }

    // Getter and Setter for id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for imageUrl
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String imageurl) {
        this.description = description;
    }
    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getter and Setter for brand
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter and Setter for rating
    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    // Getter and Setter for similarProducts
    public List<SimilarProduct> getSimilarProducts() {
        return similarProducts;
    }

    public void setSimilarProducts(List<SimilarProduct> similarProducts) {
        this.similarProducts = similarProducts;
    }
}
