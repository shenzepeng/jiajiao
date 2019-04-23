package com.example.demo.controller;

import com.example.demo.domain.Teacher;
import com.example.demo.domain.User;
import com.example.demo.repository.TeacherRepository;
import com.example.demo.service.TeacherService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;

@RestController
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @ApiOperation("通过account查询Teacher")
    @GetMapping("findTeacherByAccount.action")
    public Object findTeacherByAccount(String account, HttpServletResponse response) throws JsonProcessingException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        System.out.println(account);
        List<Teacher> list=teacherService.findTeacherByAccount(account);
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
    @ApiOperation("添加和更新Teacher，有id是为更新，无id时为增加")
    @PostMapping("saveAndFlushTeacher.action")
    public Object saveAndFlushTeacher(Teacher teacher, HttpServletResponse response) throws JsonProcessingException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        Teacher th=teacherService.saveAndFlush(teacher);
        HashMap<String,Object> hashMap=new HashMap<>();
        //引入mapper，jackson都是以他为核心
        ObjectMapper mapper = new ObjectMapper();
        if (th!=null){
            hashMap.put("end","Ok");
            hashMap.put("data",th);
        }else {
            hashMap.put("end","err");

        }
        return mapper.writeValueAsString(hashMap);
    }
    @ApiOperation("显示所有Teacher")
    @GetMapping("findAllTeacher.action")
    public Object findAll( HttpServletResponse response) throws JsonProcessingException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<Teacher> list=teacherService.findAll();
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
    @ApiOperation("通过account删除Teacher")
    @DeleteMapping("deleteTeacherByAccount.action")
    public Object deleteTeacherByAccount(String account, HttpServletResponse response) throws JsonProcessingException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        HashMap<String,Object> hashMap=new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        try {
            teacherService.deleteTeacherByAccount(account);
            hashMap.put("end","Ok");
        }catch (Exception e){
            hashMap.put("end","err");
        }
        return mapper.writeValueAsString(hashMap);
    }
    @ApiOperation("通过id删除Teacher")
    @DeleteMapping("deleteTeacherById.action")
    public Object deleteTeacherById(long id, HttpServletResponse response) throws JsonProcessingException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        HashMap<String,Object> hashMap=new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        try {
            teacherService.deleteTeacherById(id);
            hashMap.put("end","Ok");
        }catch (Exception e){
            hashMap.put("end","err");
        }
        return mapper.writeValueAsString(hashMap);

    }
}
