package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    // Constructor injection ONLY
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // ✅ REGISTER USER
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.register(user); // 🔴 FIXED HERE
    }

    // (Optional but safe for tests)
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }
}
