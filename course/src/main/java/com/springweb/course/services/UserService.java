package com.springweb.course.services;

import java.util.List;
import java.util.Optional;

import com.springweb.course.domain.User;
import com.springweb.course.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Integer id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.get();
	}

    public User insert(User obj) {
        return userRepository.save(obj);
    }
}