package com.example.demo.service;

import com.example.demo.domain.StudentPublish;

import java.util.List;

public interface StudentPublishService {
    List<StudentPublish> findStudentPublishById(long id);
    List<StudentPublish> findAll();
    StudentPublish saveAndFlush(StudentPublish studentPublish);
    void deleteById(long id);
}
