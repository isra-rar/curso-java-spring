package com.springweb.course.services;

import java.util.List;
import java.util.Optional;

import com.springweb.course.domain.Category;
import com.springweb.course.repositories.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Integer id) {
		Optional<Category> obj = categoryRepository.findById(id);
		return obj.get();
	}
}