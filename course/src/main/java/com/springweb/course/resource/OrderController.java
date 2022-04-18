package com.springweb.course.resource;

import java.util.List;

import com.springweb.course.domain.Order;
import com.springweb.course.services.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {
    
    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>> findAllOrder() {
        return ResponseEntity.ok().body(orderService.findAll()); 
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> getById(@PathVariable Integer id) {
        return ResponseEntity.ok().body(orderService.findById(id));
    }
}