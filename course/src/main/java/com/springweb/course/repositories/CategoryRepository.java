package com.springweb.course.repositories;

import com.springweb.course.domain.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    
}