package com.springproject.ecommerceApplication;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "category")
@Getter
@Setter
public class Category {

    @Id
    @Column(name = "categoryid") 
    @JsonProperty("categoryid")
    private Long categoryid;  

    @Column(name = "categoryname")
    @JsonProperty("categoryname") 
    private String categoryname;
}
