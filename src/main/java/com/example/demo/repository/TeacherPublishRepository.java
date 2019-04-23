package com.example.demo.repository;

import com.example.demo.domain.TeacherPublish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherPublishRepository extends JpaRepository<TeacherPublish,Long> {
    List<TeacherPublish> findTeacherPublishById(Long id);
    List<TeacherPublish> findAll();

    TeacherPublish saveAndFlush(TeacherPublish teacherPublish);
    void deleteById(long id);

}
