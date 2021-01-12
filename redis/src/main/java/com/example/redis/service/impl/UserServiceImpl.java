package com.example.redis.service.impl;

import com.example.redis.dao.UserDao;
import com.example.redis.entity.User;
import com.example.redis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by zhangz on 2021/1/12
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        List<User> all = userDao.findAll();
        return all;
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public int deleteByUssername(String username) {
        return 0;
    }

    @Override
    public int updateByUsername(User user) {
        return 0;
    }
}
