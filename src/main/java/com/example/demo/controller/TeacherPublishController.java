package com.example.demo.controller;

import com.example.demo.domain.Student;
import com.example.demo.domain.TeacherPublish;
import com.example.demo.repository.TeacherPublishRepository;
import com.example.demo.service.TeacherPublishService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;

@RestController
public class TeacherPublishController {
    @Autowired
    private TeacherPublishService teacherPublishService;
    @ApiOperation("通过id查找TeacherPublish")
    @GetMapping("findTeacherPublishById.action")
    public Object findTeacherPublishById(Long id,HttpServletResponse response) throws JsonProcessingException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<TeacherPublish> list=teacherPublishService.findTeacherPublishById(id);
       // List<Student> list=studentService.findStudentByAccount(account);
        HashMap<String,Object> hashMap=new HashMap<>();
        //引入mapper，jackson都是以他为核心
        ObjectMapper mapper = new ObjectMapper();
        if (list.size()!=0){
            hashMap.put("end","Ok");
            hashMap.put("data",list.get(0));
        }else {
            hashMap.put("end","err");
            hashMap.put("data",null);
        }
        return mapper.writeValueAsString(hashMap);
    }
    @ApiOperation("显示所有TeacherPublish")
    @GetMapping("findAllTeacherPublish.action")
    public Object findAll(HttpServletResponse response) throws JsonProcessingException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<TeacherPublish> list=teacherPublishService.findAll();
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
    @ApiOperation("添加和更新TeacherPublish，有id是为更新，无id时为增加")
    @PostMapping("saveAndFlushTeacherPublish.action")
    public Object saveAndFlushTeacherPublish(TeacherPublish teacherPublish, HttpServletResponse response) throws JsonProcessingException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        TeacherPublish tp=teacherPublishService.saveAndFlush(teacherPublish);
        HashMap<String,Object> hashMap=new HashMap<>();
        //引入mapper，jackson都是以他为核心
        ObjectMapper mapper = new ObjectMapper();
        if (tp!=null){
            hashMap.put("end","Ok");
            hashMap.put("data",tp);
        }else {
            hashMap.put("end","err");

        }
        return mapper.writeValueAsString(hashMap);
    }
    @ApiOperation("通过Id删除TeacherPublish")
    @DeleteMapping("deleteTeacherPublishById.action")
    public Object deleteTeacherPublishById(long id, HttpServletResponse response) throws JsonProcessingException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        HashMap<String,Object> hashMap=new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        try {
            teacherPublishService.deleteTeacherPublishById(id);
            hashMap.put("end","Ok");
        }catch (Exception e){
            hashMap.put("end","err");
        }
        return mapper.writeValueAsString(hashMap);

    }
}
