package com.example.demo.controller;

import com.example.demo.domain.Comment;
import com.example.demo.domain.Student;
import com.example.demo.service.CommentService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;

@RestController
public class CommentController {
    @Autowired
    private CommentService commentService;
    @ApiOperation("添加和更新Comment，有id是为更新，无id时为增加")
    @PostMapping("saveAndFlushComment.action")
    public Object saveAndFlush(Comment comment, HttpServletResponse response) throws JsonProcessingException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        Comment comment1=commentService.saveAndFlush(comment);
        HashMap<String,Object> hashMap=new HashMap<>();
        //引入mapper，jackson都是以他为核心
        ObjectMapper mapper = new ObjectMapper();
        if (comment1!=null){
            hashMap.put("end","Ok");
            hashMap.put("data",comment1);
        }else {
            hashMap.put("end","err");

        }
        return mapper.writeValueAsString(hashMap);
    }
    @ApiOperation("通过teacherId查找Comment")
    @GetMapping("findCommentByTeacherId.action")
    public Object findCommentByTeacherId(long teacherId,HttpServletResponse response) throws JsonProcessingException {
        List<Comment> list=commentService.findCommentByTeacherId(teacherId);
        response.setHeader("Access-Control-Allow-Origin", "*");
        HashMap<String,Object> hashMap=new HashMap<>();
        //引入mapper，jackson都是以他为核心
        ObjectMapper mapper = new ObjectMapper();
        if (list.size()!=0){
            hashMap.put("end","Ok");
            hashMap.put("data",list);
        }else {
            hashMap.put("end","err");
            hashMap.put("data",null);
        }
        return mapper.writeValueAsString(hashMap);
    }
    @ApiOperation("通过id删除Comment")
    @DeleteMapping("deleteCommentById.action")
    public Object deleteCommentById(long id,HttpServletResponse response) throws JsonProcessingException {
        System.out.println(id);
        response.setHeader("Access-Control-Allow-Origin", "*");
        HashMap<String,Object> hashMap=new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        try {

            commentService.deleteById(id);

            hashMap.put("end","Ok");
        }catch (Exception e){
            e.printStackTrace();
            hashMap.put("end","err");
        }
        return mapper.writeValueAsString(hashMap);
    }
    @ApiOperation("通过teacherId删除Comment")
    @DeleteMapping("deleteCommentByTeacherId.action")
    public Object deleteCommentByTeacherId(long teacherId, HttpServletResponse response) throws JsonProcessingException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        System.out.println(teacherId);
        HashMap<String,Object> hashMap=new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        try {
            commentService.deleteByTeacherId(teacherId);

            hashMap.put("end","Ok");
        }catch (Exception e){
            hashMap.put("end","err");
        }
        return mapper.writeValueAsString(hashMap);
    }

    @GetMapping("findAllComment.action")
    public Object findAll(HttpServletResponse response) throws JsonProcessingException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<Comment> list=commentService.findAll();
        HashMap<String,Object> hashMap=new HashMap<>();
        //引入mapper，jackson都是以他为核心
        ObjectMapper mapper = new ObjectMapper();
        if (list.size()!=0){
            hashMap.put("end","Ok");
            hashMap.put("data",list);
        }else {
            hashMap.put("end","err");
            hashMap.put("data",null);
        }
        return mapper.writeValueAsString(hashMap);
    }

}
