package com.study.designpattern.create.singleton;

/**
 * Create by zhangz on 2020/12/15 单例模式
 */
public class Singleton_01 {
    /**
     *  懒汉模式 线程不安全不推荐使用
     */

    private static Singleton_01 instance;
    private Singleton_01(){
        //业务代码

    }
    public static Singleton_01 getInstance(){
       if (null == instance){
           instance = new Singleton_01();
       }
       return instance;
    }
}
