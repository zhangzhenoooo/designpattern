package com.study.security.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Create by zhangz on 2021/1/5
 */
@RestController
@Slf4j
public class CommonController {

    @RequestMapping("/")
    public Object index(HttpServletResponse response) throws IOException {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication;
    }


    @RequestMapping("/root")
    @PreAuthorize("hasRole('ROLE_ROOT')")
    public Object root(HttpServletResponse response) throws IOException {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "root";
    }
    @RequestMapping("/admin")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Object admin(HttpServletResponse response) throws IOException {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "admin";
    }
    @RequestMapping("/user")
    @PreAuthorize("hasRole('ROLE_USER')")
    public Object user(HttpServletResponse response) throws IOException {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "this is a user";
    }

    @RequestMapping("/api/session")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public Object session(HttpServletResponse response) throws IOException {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication;
    }

    @RequestMapping("/api/users")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Object users(HttpServletResponse response) throws IOException {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return new ArrayList<>();
    }

    @RequestMapping("/main")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USER','ROLE_ROOT')")
    public Object main(HttpServletResponse response) throws IOException {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return new ArrayList<>();
    }
}
