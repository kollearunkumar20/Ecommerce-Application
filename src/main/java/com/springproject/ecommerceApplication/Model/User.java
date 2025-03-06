package com.springproject.ecommerceApplication;

import jakarta.persistence.*;


@Table(name = "users")
@Entity
public class User {

    @Id
    private String username;
    private String password;
    @Column(name = "issubscribed")
    private boolean isSubscribed; // New attribute to track subscription status

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isSubscribed() {
        return isSubscribed;
    }

    public void setSubscribed(boolean isSubscribed) {
        this.isSubscribed = isSubscribed;
    }
}
