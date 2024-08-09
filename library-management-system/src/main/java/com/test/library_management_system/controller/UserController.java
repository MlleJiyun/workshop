package com.test.library_management_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.library_management_system.entity.User;
import com.test.library_management_system.service.UserService;

// api/users/
@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping
    public List<User> getAllUsers() {
        return userService.findAll();
    }   
    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.save(user);
    }
}
