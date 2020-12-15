package com.study.designpattern.create.singleton;

/**
 * Create by zhangz on 2020/12/15 单例模式
 */
public class Singleton_02 {
    /**
     *  懒汉模式 线程安全 但是锁加在了方法上，每次获取时都会加载锁，导致资源占用 不推荐使用
     */

    private static Singleton_02 instance;
    private Singleton_02(){
        //业务代码

    }
    public static synchronized Singleton_02 getInstance(){
       if (null == instance){
           instance = new Singleton_02();
       }
       return instance;
    }
}
