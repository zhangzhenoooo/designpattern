package com.example.redis.controller;

import com.example.redis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by zhangz on 2021/1/12
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/listAllUser")
    public Object listAllUser(){
       return userService.findAll();
    }
}
