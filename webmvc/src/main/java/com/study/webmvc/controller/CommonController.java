package com.study.webmvc.controller;

import com.study.webmvc.interceptor.MyException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by zhangz on 2021/1/4
 */
@RestController
public class CommonController {

    @PostMapping("/app/testInterceptor")
    public String testInterceptor(){
        return "testInterceptor";
    }

    @PostMapping("/app/testException")
    public String testException(){
        throw  new MyException("500","测试","");
    }

}
