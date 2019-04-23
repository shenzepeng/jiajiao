package com.example.demo.service;

import com.example.demo.domain.Comment;

import java.util.List;

public interface CommentService {
    Comment saveAndFlush(Comment comment);
    List<Comment> findCommentByTeacherId(long teacherId);
    void deleteById(long id);
    void deleteByTeacherId(long teacherId);
    List<Comment> findAll();
}
