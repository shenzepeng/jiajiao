package com.example.demo.service;

import com.example.demo.domain.Teacher;
import com.example.demo.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;
    @Override
    public List<Teacher> findTeacherByAccount(String account) {
        List<Teacher> list=teacherRepository.findTeacherByAccount(account);
        return list;
    }

    @Override
    public Teacher saveAndFlush(Teacher teacher) {
        Teacher th=teacherRepository.saveAndFlush(teacher);
        return th;
    }

    @Override
    public List<Teacher> findAll() {
        List<Teacher> list=teacherRepository.findAll();
        return list;
    }

    @Override
    public void deleteTeacherByAccount(String account) {
        teacherRepository.deleteByAccount(account);
    }

    @Override
    public void deleteTeacherById(long id) {
        teacherRepository.deleteById(id);
    }
}
