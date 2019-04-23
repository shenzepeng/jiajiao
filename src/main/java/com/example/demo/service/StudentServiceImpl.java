package com.example.demo.service;

import com.example.demo.domain.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> findStudentByAccount(String account) {
        List<Student> list=studentRepository.findStudentByAccount(account);
        return list;
    }

    @Override
    public Student saveAndFlush(Student student) {
        Student stu=studentRepository.saveAndFlush(student);
        return stu;
    }

    @Override
    public void deleteStudentByAccount(String account) {
        studentRepository.deleteByAccount(account);
    }

    @Override
    public void deleteStudentById(long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> findAll() {
        List<Student> list=studentRepository.findAll();
        return list;
    }
}
