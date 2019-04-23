package com.example.demo.controller;

import com.example.demo.domain.Student;
import com.example.demo.domain.Teacher;
import com.example.demo.service.StudentService;
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
public class StudentController {
    @Autowired
    private StudentService studentService;

    @ApiOperation("通过Account查询Student")
    @GetMapping("findStudentByAccount.action")
    public Object findStudentByAccount(String account,HttpServletResponse response) throws JsonProcessingException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<Student> list=studentService.findStudentByAccount(account);
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
    @ApiOperation("")
    @PostMapping("saveAndFlushStudent.action")
    public Object saveAndFlush(Student student,HttpServletResponse response) throws JsonProcessingException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        Student sd=studentService.saveAndFlush(student);
        HashMap<String,Object> hashMap=new HashMap<>();
        //引入mapper，jackson都是以他为核心
        ObjectMapper mapper = new ObjectMapper();
        if (sd!=null){
            hashMap.put("end","Ok");
            hashMap.put("data",sd);
        }else {
            hashMap.put("end","err");

        }
        return mapper.writeValueAsString(hashMap);
    }
    @ApiOperation("通过Account删除Student")
    @DeleteMapping("deleteStudentByAccount.action")
    public Object deleteStudentByAccount(String account,HttpServletResponse response) throws JsonProcessingException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        HashMap<String,Object> hashMap=new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        try {
            studentService.deleteStudentByAccount(account);
            hashMap.put("end","Ok");
        }catch (Exception e){
            hashMap.put("end","err");
        }
        return mapper.writeValueAsString(hashMap);
    }
    @ApiOperation("通过id删除Student")
    @DeleteMapping("deleteStudentById.action")
    public Object deleteStudentById(long id,HttpServletResponse response) throws JsonProcessingException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        HashMap<String,Object> hashMap=new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        try {
            studentService.deleteStudentById(id);
            hashMap.put("end","Ok");
        }catch (Exception e){
            hashMap.put("end","err");
        }
        return mapper.writeValueAsString(hashMap);
    }
    @ApiOperation("显示所有Student")
    @GetMapping("findAllStudent.action")
    public Object  findAll(HttpServletResponse response) throws JsonProcessingException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<Student> list=studentService.findAll();

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
