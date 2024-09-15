package com.orm.learningorm.repositories;

import com.orm.learningorm.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students, Integer> {

}
