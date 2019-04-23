package com.example.demo.repository;

import com.example.demo.domain.Student;
import com.example.demo.domain.StudentPublish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentPublishRepository extends JpaRepository<StudentPublish,Long> {
    List<StudentPublish> findStudentPublishById(long id);
    List<StudentPublish> findAll();
    StudentPublish saveAndFlush(StudentPublish studentPublish);
    void deleteById(long id);
}
