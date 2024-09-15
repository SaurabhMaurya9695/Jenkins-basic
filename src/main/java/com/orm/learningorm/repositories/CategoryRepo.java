package com.orm.learningorm.repositories;

import com.orm.learningorm.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,Integer> {

}
