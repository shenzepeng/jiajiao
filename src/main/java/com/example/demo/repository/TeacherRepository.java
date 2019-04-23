package com.example.demo.repository;

import com.example.demo.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {
    List<Teacher> findTeacherByAccount(String account);
    Teacher saveAndFlush(Teacher teacher);
    List<Teacher> findAll();
    void deleteByAccount(String account);
    void deleteById(long id);
}
