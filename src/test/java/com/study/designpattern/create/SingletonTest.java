package com.study.designpattern.create;

import com.study.designpattern.create.singleton.Singleton_05;
import org.junit.jupiter.api.Test;

/**
 * Create by zhangz on 2020/12/15 测试单例类
 */
public class SingletonTest {
   @Test
    public void test(){
       Singleton_05.INSTANCE.test();
   }
}
