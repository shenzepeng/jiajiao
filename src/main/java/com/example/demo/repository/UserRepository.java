package com.example.demo.repository;

import com.example.demo.domain.Teacher;
import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findUserById(Long id);
    List<User> findUserByAccount(String account);
    void deleteById(Long id);
    User saveAndFlush(User user);
    List<User> findAll();
}
