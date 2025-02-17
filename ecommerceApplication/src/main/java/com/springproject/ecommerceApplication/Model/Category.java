package com.springproject.ecommerceApplication;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "category") // Ensure the table is named "category"
@Getter
@Setter
public class Category {

    @Id
    private Long categoryId;

    @Column(name = "category_name", nullable = false, unique = true)
    private String categoryName;
}
