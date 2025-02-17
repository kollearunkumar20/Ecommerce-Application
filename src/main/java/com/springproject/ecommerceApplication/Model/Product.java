package com.springproject.ecommerceApplication;

import jakarta.persistence.*;

@Entity
@Table(name = "product") 
public class Product {

    @Id
    private Long id;

    private String name;  

    private String brand;

    private double price;

    private String imageurl;

    private double rating;
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "categoryId", nullable = false)  // Define foreign key relationship
    private Category category; 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Category getCategory() {
        return category;
    }

    public void SetCategory(Category category){
        this.category = category;
    }
}
