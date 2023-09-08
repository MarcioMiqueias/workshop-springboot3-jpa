package com.projectClassJava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectClassJava.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
