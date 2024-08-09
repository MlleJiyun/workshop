package com.test.library_management_system.service;

import java.util.List;

import com.test.library_management_system.entity.User;

public interface UserService {
    List<User> findAll();
    User save(User user);
}
