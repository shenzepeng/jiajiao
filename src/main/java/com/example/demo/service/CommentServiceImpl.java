package com.example.demo.service;

import com.example.demo.domain.Comment;
import com.example.demo.repository.CommentRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;
    @Override
    public Comment saveAndFlush(Comment comment) {
        Comment comment1=commentRepository.saveAndFlush(comment);
        return comment1;
    }

    @Override
    public List<Comment> findCommentByTeacherId(long teacherId) {
        List<Comment> list=commentRepository.findCommentByTeacherId(teacherId);
        return list;
    }

    @Override
    public void deleteById(long id) {
        commentRepository.deleteById(id);

    }

    @Override
    public void deleteByTeacherId(long teacherId) {
        commentRepository.deleteByTeacherId(teacherId);
    }

    @Override
    public List<Comment> findAll() {
        List<Comment> list=commentRepository.findAll();
        return list;
    }
}
