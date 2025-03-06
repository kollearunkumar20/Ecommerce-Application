package com.springproject.ecommerceApplication;

import jakarta.persistence.*;

public class SimilarProduct {
    private Long id;
    private String imageurl;
    private String name;
    private double price;
    private String brand;
    private double rating;

    // Constructor
    public SimilarProduct(Long id, String imageurl, String name, double price, String brand, double rating) {
        this.id = id;
        this.imageurl = imageurl;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.rating = rating;
    }

    // Getter and Setter for id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for imageurl
    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
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
}
