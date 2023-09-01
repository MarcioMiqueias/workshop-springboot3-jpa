package com.projectClassJava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectClassJava.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
