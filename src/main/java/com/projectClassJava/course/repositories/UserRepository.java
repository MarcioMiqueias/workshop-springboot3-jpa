package com.projectClassJava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectClassJava.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
