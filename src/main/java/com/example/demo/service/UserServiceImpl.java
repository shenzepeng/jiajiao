package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> findUserById(Long id) {
        List<User> list=userRepository.findUserById(id);
        return list;
    }

    @Override
    public List<User> findUserByAccount(String account) {
        List<User> list=userRepository.findUserByAccount(account);
        return list;
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User saveAndFlush(User user) {
        User u=userRepository.saveAndFlush(user);
        return u;
    }

    @Override
    public List<User> findAll() {
        List<User> list=userRepository.findAll();
        return list;
    }
}
