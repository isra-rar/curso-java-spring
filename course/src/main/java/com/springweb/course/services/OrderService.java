package com.springweb.course.services;

import java.util.List;
import java.util.Optional;

import com.springweb.course.domain.Order;
import com.springweb.course.repositories.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Integer id) {
		Optional<Order> obj = orderRepository.findById(id);
		return obj.get();
	}
}