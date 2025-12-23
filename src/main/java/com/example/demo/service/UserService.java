package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {

    // Add these methods
    User saveUser(User user);

    User getUserById(Long id);

    // Optional: existing register/findByEmail
    User register(User user);
    User findByEmail(String email);
}
