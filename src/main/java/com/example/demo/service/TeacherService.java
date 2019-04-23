package com.example.demo.service;

import com.example.demo.domain.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> findTeacherByAccount(String account);
    Teacher saveAndFlush(Teacher teacher);
    List<Teacher> findAll();
    void deleteTeacherByAccount(String account);
    void deleteTeacherById(long id);
}
