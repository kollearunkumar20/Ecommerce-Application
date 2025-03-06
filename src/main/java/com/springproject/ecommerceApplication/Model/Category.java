package com.springproject.ecommerceApplication;

import jakarta.persistence.*;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @Column(name = "categoryid") 
    private Long categoryid;  

    @Column(name = "categoryname")
    private String categoryname;

    // Getter for categoryid
    public Long getCategoryid() {
        return categoryid;
    }

    // Setter for categoryid
    public void setCategoryid(Long categoryid) {
        this.categoryid = categoryid;
    }

    // Getter for categoryname
    public String getCategoryname() {
        return categoryname;
    }

    // Setter for categoryname
    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }
}
