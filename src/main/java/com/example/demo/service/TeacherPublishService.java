package com.example.demo.service;

import com.example.demo.domain.TeacherPublish;

import java.util.List;

public interface TeacherPublishService {
    List<TeacherPublish> findTeacherPublishById(Long id);
    List<TeacherPublish> findAll();

    TeacherPublish saveAndFlush(TeacherPublish teacherPublish);
    void deleteTeacherPublishById(long id);
}
