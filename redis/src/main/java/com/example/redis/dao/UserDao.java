package com.example.redis.dao;

import com.example.redis.entity.User;
import io.lettuce.core.dynamic.annotation.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Create by zhangz on 2021/1/12
 */
@Mapper
public interface UserDao {
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
    User findByUsername(@Param("username") String username);

    /**
     *  删除用户
     * @param username
     * @return
     */
     int deleteByUssername(@Param("username") String username);

    /**
     *  更新用户
     * @param user
     * @return
     */
     int updateByUsername(@Param("user") User user);
}
