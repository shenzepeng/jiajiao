package com.example.demo.service;

import com.example.demo.domain.Student;

import java.util.List;

public interface StudentService {
    List<Student> findStudentByAccount(String account);
    Student saveAndFlush(Student student);
    void deleteStudentByAccount(String account);
    void deleteStudentById(long id);
    List<Student> findAll();
}
