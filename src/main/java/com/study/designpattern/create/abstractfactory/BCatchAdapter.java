package com.study.designpattern.create.abstractfactory;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * Create by zhangz on 2020/12/10
 * 模拟redis 集群B
 */
@Slf4j
public class BCatchAdapter implements ICatchAdapter {
    @Override
    public String get(String key) {
        log.info("RCatch -> function : get ,param :{}",key);
        return null;
    }

    @Override
    public void set(String key, String value) {
        log.info("BCatch -> function : set ,params :{}",key,value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        log.info("BCatch -> function : set ,params :{}",key,value,timeout,timeUnit);

    }

    @Override
    public void del(String key) {
        log.info("BCatch -> function : del ,params :{}",key);

    }
}
