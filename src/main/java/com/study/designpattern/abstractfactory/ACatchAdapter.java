package com.study.designpattern.abstractfactory;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * Create by zhangz on 2020/12/10
 * 模拟redis 集群A
 */
@Slf4j
public class ACatchAdapter implements ICatchAdapter {
    @Override
    public String get(String key) {
        log.info("ACatch -> function : get ,param :{}",key);
        return null;
    }

    @Override
    public void set(String key, String value) {
        log.info("ACatch -> function : set ,params :{}",key,value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        log.info("ACatch -> function : set ,params :{}",key,value,timeout,timeUnit);

    }

    @Override
    public void del(String key) {
        log.info("ACatch -> function : del ,params :{}",key);

    }
}
