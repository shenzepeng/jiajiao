package com.example.demo.service;

import com.example.demo.domain.StudentPublish;
import com.example.demo.repository.StudentPublishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentPublishServiceImpl implements StudentPublishService {
    @Autowired
    private StudentPublishRepository studentPublishRepository;
    @Override
    public List<StudentPublish> findStudentPublishById(long id) {
        List<StudentPublish> list=studentPublishRepository.findStudentPublishById(id);
        return list;
    }

    @Override
    public List<StudentPublish> findAll() {
        List<StudentPublish> list=studentPublishRepository.findAll();
        return list;
    }

    @Override
    public StudentPublish saveAndFlush(StudentPublish studentPublish) {
        StudentPublish studentPublish1=studentPublishRepository.saveAndFlush(studentPublish);
        return studentPublish1;
    }

    @Override
    public void deleteById(long id) {

        studentPublishRepository.deleteById(id);
    }
}
