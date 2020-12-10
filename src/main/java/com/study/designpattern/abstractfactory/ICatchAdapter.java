package com.study.designpattern.abstractfactory;

import java.util.concurrent.TimeUnit;

/**
 * @email 1804919062@qq.com
 * @author:zhangz
 * @date: 2020/12/10
 * @time: 21:15
 */
public interface ICatchAdapter {
    String get(String key);
    void set(String key, String value);
    void set(String key, String value, long timeout, TimeUnit timeUnit);
    void del(String key);
}
