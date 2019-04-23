package com.example.demo.repository;

import com.example.demo.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findStudentByAccount(String account);
    Student saveAndFlush(Student student);
    void deleteByAccount(String account);
    void deleteById(long id);
    List<Student> findAll();
}
