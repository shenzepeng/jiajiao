package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import com.example.demo.service.UserServiceImpl;
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
public class UserController {
    @Autowired
    private UserService userServiceImpl;
    @GetMapping("findUserById.action")
    @ApiOperation("通过id找User")
    public Object findUserById(long id,HttpServletResponse response) throws JsonProcessingException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        System.out.println(id);
        List<User> list=userServiceImpl.findUserById(id);
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
    @ApiOperation("通过account查找User")
    @GetMapping("findUserByAccount.action")
    public Object findUserByAccount(String account,HttpServletResponse response) throws JsonProcessingException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<User> list=userServiceImpl.findUserByAccount(account);
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
    @ApiOperation("通过id删除User")
    @DeleteMapping("deleteUserById.action")
    public Object deleteById(Long id,HttpServletResponse response) throws JsonProcessingException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        HashMap<String,Object> hashMap=new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        try {
            userServiceImpl.deleteById(id);
            hashMap.put("end","Ok");
        }catch (Exception e){
            hashMap.put("end","err");
        }
        return mapper.writeValueAsString(hashMap);
    }
    @ApiOperation("更新user，有id是为更新，无id时为增加")
    @PostMapping("saveAndFlushUser.action")
    public Object saveAndFlush(User user,HttpServletResponse response) throws JsonProcessingException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        User u=userServiceImpl.saveAndFlush(user);
        HashMap<String,Object> hashMap=new HashMap<>();
        //引入mapper，jackson都是以他为核心
        ObjectMapper mapper = new ObjectMapper();
        if (u!=null){
            hashMap.put("end","Ok");
            hashMap.put("data",u);
        }else {
            hashMap.put("end","err");

        }
        return mapper.writeValueAsString(hashMap);
    }
    @ApiOperation("显示所有User")
    @GetMapping("findAllUser.action")
    public Object findAll(HttpServletResponse response) throws JsonProcessingException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<User> list=userServiceImpl.findAll();
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
