package com.springweb.course.resource;

import java.util.List;

import com.springweb.course.domain.Category;
import com.springweb.course.services.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {
    
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        return ResponseEntity.ok().body(categoryService.findAll()); 
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> getById(@PathVariable Integer id) {
        return ResponseEntity.ok().body(categoryService.findById(id));
    }
}