package com.study.designpattern.testfuture;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Future;

/**
 * Create by zhangz on 2021/1/4
 */
public class TestFuture {
    public static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public Future myTask(){
        System.out.println("task start ======================" + SIMPLE_DATE_FORMAT.format(new Date()));
       System.out.println("this is a future task!");
        for (int i = 0; i < 1000000; i++) {

        }
        System.out.println(" task end ======================" + SIMPLE_DATE_FORMAT.format(new Date()));
       return null;
    }

//    public static void main(String[] args) {
//        TestFuture testFuture = new TestFuture();
//        System.out.println("test start ======================" + SIMPLE_DATE_FORMAT.format(new Date()));
//        testFuture.myTask();
//        System.out.println("test end ======================" + SIMPLE_DATE_FORMAT.format(new Date()));
//    }
}
