package com.study.designpattern.create.abstractfactory;

import java.util.concurrent.TimeUnit;

/**
 * Create by zhangz on 2020/12/10
 * redis 接口适配器
 */
public interface ICatchAdapter {
    String get(String key);
    void set(String key, String value);
    void set(String key, String value, long timeout, TimeUnit timeUnit);
    void del(String key);
}
