package com.study.designpattern.abstractfactory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * Create by zhangz on 2020/12/10
 * 模拟redis 集群A
 */
@Slf4j
@Service("BCatchAdapter")
public class BCatchAdapter implements ICatchAdapter {
    @Override
    public String get(String key) {
        log.info("BCatch -> function : get key :{}",key);
        return null;
    }

    @Override
    public void set(String key, String value) {
        log.info("ACatch -> function : set key{},value :{}",key,value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        log.info("BCatch -> function : set key {},value {},timeout {},timeUnit {}",key,value,timeout,timeUnit);

    }

    @Override
    public void del(String key) {
        log.info("BCatch -> function : del key {}",key);

    }
}
