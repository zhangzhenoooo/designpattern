package com.study.designpattern.create.singleton;

/**
 * Create by zhangz on 2020/12/15
 */
public class Singleton_04 {
    /**
     * 静态内部类实现,懒加载，线程安全，推荐使用法之一
     */
    private static class SingletonHolder{
        private static Singleton_04 instance = new Singleton_04();
    }
    private Singleton_04(){
        // 业务代码
    }
    public Singleton_04 getInstance(){
        return SingletonHolder.instance;
    }

}
