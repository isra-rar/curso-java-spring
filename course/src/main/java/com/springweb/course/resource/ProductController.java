package com.springweb.course.resource;

import java.util.List;

import com.springweb.course.domain.Product;
import com.springweb.course.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    
    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        return ResponseEntity.ok().body(productService.findAll()); 
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> getById(@PathVariable Integer id) {
        return ResponseEntity.ok().body(productService.findById(id));
    }
}