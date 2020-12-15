package com.study.designpattern.create.singleton;

/**
 * Create by zhangz on 2020/12/15
 */
public class Singleton_03 {
    /**
     *  饿汉模式 线程安全 但是在项目加载之初便会加载导致占用没必要的内存
     */

    private static Singleton_03 instance = new Singleton_03();
    private Singleton_03(){
        // 业务代码
    }
    public static Singleton_03 getInstance(){
        return instance;
    }
}
