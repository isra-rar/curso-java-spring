package com.springweb.course.repositories;

import com.springweb.course.domain.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    
}