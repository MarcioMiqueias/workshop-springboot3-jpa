package com.projectClassJava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectClassJava.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
