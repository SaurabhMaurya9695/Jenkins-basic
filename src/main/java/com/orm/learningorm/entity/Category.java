package com.orm.learningorm.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {

    @Id
    private int categoryId;

    private String category;

    public Category() {
    }

    public Category(int categoryId, String category) {
        this.categoryId = categoryId;
        this.category = category;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }

    @ManyToMany(mappedBy = "categories",cascade = CascadeType.ALL)
    public List<Products> products=new ArrayList<>();

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
