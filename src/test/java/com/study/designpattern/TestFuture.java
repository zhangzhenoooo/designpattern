package com.study.designpattern;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Create by zhangz on 2021/1/4
 */
@SpringBootTest
public class TestFuture {
    @Test
    public void test(){
        final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        com.study.designpattern.testfuture.TestFuture testFuture = new com.study.designpattern.testfuture.TestFuture();
        System.out.println("test start ======================" + SIMPLE_DATE_FORMAT.format(new Date()));
        testFuture.myTask();
        System.out.println("test end ======================" + SIMPLE_DATE_FORMAT.format(new Date()));
    }
}
