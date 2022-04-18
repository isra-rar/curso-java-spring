package com.springweb.course.repositories;

import com.springweb.course.domain.OrderItem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdemItemRepository extends JpaRepository<OrderItem, Integer> {
    
}