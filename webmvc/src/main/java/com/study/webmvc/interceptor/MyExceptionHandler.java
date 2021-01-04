package com.study.webmvc.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/** 统一异常处理类
 * Create by zhangz on 2021/1/4
 */
@Slf4j
@RestControllerAdvice
public class MyExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    Object defaultExceptionHandler(Exception e, HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        map.put("code","500");
        map.put("message",e.getMessage());
        map.put("url",request.getContextPath());
        return map;
    }

    @ExceptionHandler(value = MyException.class)
    Object myExceptionHandler(MyException e, HttpServletRequest request, HttpServletResponse response){
        Map<String,Object> map = new HashMap<>();
        map.put("code",e.getCode());
        map.put("message",e.getMessage());
        map.put("url",request.getContextPath());
        return map;
    }
}
