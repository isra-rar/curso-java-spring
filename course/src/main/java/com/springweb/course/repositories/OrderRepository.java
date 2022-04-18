package com.springweb.course.repositories;


import com.springweb.course.domain.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer>{
    
}