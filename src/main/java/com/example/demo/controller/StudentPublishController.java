package com.example.demo.controller;

import com.example.demo.domain.Student;
import com.example.demo.domain.StudentPublish;
import com.example.demo.domain.Teacher;
import com.example.demo.service.StudentPublishService;
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
public class StudentPublishController {
    @Autowired
    private StudentPublishService studentPublishService;
    @ApiOperation("通过id查询StudentPublish")
    @GetMapping("findStudentPublishById.action")
    public Object findStudentPublishById(long id, HttpServletResponse response) throws JsonProcessingException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<StudentPublish> list=studentPublishService.findStudentPublishById(id);
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
    @ApiOperation("显示所有StudentPublish")
    @GetMapping("findAll.action")
    public Object findAll( HttpServletResponse response) throws JsonProcessingException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<StudentPublish> list=studentPublishService.findAll();
        //List<Teacher> list=teacherService.findAll();
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
    @ApiOperation("添加和更新StudentPublish，有id是为更新，无id时为增加")
    @PostMapping("saveAndFlushStudentPublish.action")
    public Object saveAndFlush(StudentPublish studentPublish, HttpServletResponse response) throws JsonProcessingException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        StudentPublish sp=studentPublishService.saveAndFlush(studentPublish);
       // Student sd=studentService.saveAndFlush(student);
        HashMap<String,Object> hashMap=new HashMap<>();
        //引入mapper，jackson都是以他为核心
        ObjectMapper mapper = new ObjectMapper();
        if (sp!=null){
            hashMap.put("end","Ok");
            hashMap.put("data",sp);
        }else {
            hashMap.put("end","err");

        }
        return mapper.writeValueAsString(hashMap);
    }
    @ApiOperation("通过id删除StudentPublish")
    @DeleteMapping("deleteStudentPublishById.action")
    public Object deleteById(long id,HttpServletResponse response) throws JsonProcessingException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        HashMap<String,Object> hashMap=new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        try {
            studentPublishService.deleteById(id);
            hashMap.put("end","Ok");
        }catch (Exception e){
            hashMap.put("end","err");
        }
        return mapper.writeValueAsString(hashMap);
    }
}
