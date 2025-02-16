package com.springproject.ecommerceApplication;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "product") // Ensures table creation
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // Maps JSON field "title" to "name"
    private String name;  // Renamed to match expected DB field

    private String brand;
    private double price;
    // Maps JSON field "image_url" to "imageUrl"
    private String imageurl;

    private double rating;
}
