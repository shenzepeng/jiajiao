package com.example.demo.repository;

import com.example.demo.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {
    Comment saveAndFlush(Comment comment);
    List<Comment> findCommentByTeacherId(long teacherId);
    void deleteById(long id);
    void deleteByTeacherId(long teacherId);
    List<Comment> findAll();
}
