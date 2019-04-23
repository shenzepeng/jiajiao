package com.example.demo.service;

import com.example.demo.domain.User;

import java.util.List;

public interface UserService {
    List<User> findUserById(Long id);
    List<User> findUserByAccount(String account);
    void deleteById(Long id);
    User saveAndFlush(User user);
    List<User> findAll();
}
