package com.example.demo.service;

import com.example.demo.domain.TeacherPublish;
import com.example.demo.repository.TeacherPublishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherPublishServiceImpl implements TeacherPublishService {
    @Autowired
    private TeacherPublishRepository teacherPublishRepository;

    @Override
    public List<TeacherPublish> findTeacherPublishById(Long id) {
        List<TeacherPublish> list=teacherPublishRepository.findTeacherPublishById(id);
        return list;
    }

    @Override
    public List<TeacherPublish> findAll() {
        List<TeacherPublish> list=teacherPublishRepository.findAll();
        return list;
    }

    @Override
    public TeacherPublish saveAndFlush(TeacherPublish teacherPublish) {
        TeacherPublish tp=teacherPublishRepository.saveAndFlush(teacherPublish);
        return tp;
    }



    @Override
    public void deleteTeacherPublishById(long id) {

        teacherPublishRepository.deleteById(id);
    }
}
