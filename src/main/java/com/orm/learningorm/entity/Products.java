package com.orm.learningorm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
public class Products {

    @Id
    private  int productId;
    private  String productName;

    public Products() {
    }

    public Products(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public Products(int productId, String productName, List<Category> categories) {
        this.productId = productId;
        this.productName = productName;
        this.categories = categories;
    }

    @ManyToMany
    public List<Category> categories=new ArrayList<>();

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
