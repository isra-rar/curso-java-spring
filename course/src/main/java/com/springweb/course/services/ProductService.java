package com.springweb.course.services;

import java.util.List;
import java.util.Optional;

import com.springweb.course.domain.Product;
import com.springweb.course.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Integer id) {
		Optional<Product> obj = productRepository.findById(id);
		return obj.get();
	}
    
}