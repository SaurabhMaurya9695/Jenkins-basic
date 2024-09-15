package com.orm.learningorm.repositories;

import com.orm.learningorm.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Products,Integer> {
}
