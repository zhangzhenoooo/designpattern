package com.example.redis.service;

import com.example.redis.entity.User;
import io.lettuce.core.dynamic.annotation.Param;

import java.util.List;

/**
 * Create by zhangz on 2021/1/12
 */
public interface UserService {
    /**
     *  获取所有用户
     * @return
     */
    List<User> findAll();

    /**
     * 根据用户名查询用户
     * @param username
     * @return user对象
     */
    User findByUsername( String username);

    /**
     *  删除用户
     * @param username
     * @return
     */
    int deleteByUssername(String  username);

    /**
     *  更新用户
     * @param user
     * @return
     */
    int updateByUsername(@Param("user") User user);
}
