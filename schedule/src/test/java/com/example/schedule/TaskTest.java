package com.example.schedule;

import com.example.schedule.config.taskschedule.SchedulingRunnable;
import com.example.schedule.register.CronTaskRegistrar;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @program: simple-demo
 * @description: 测试定时任务
 * @author: CaoTing
 * @date: 2019/5/23
 **/
@SpringBootTest(classes = ScheduleApplication.class)
public class TaskTest {

    @Autowired
    CronTaskRegistrar cronTaskRegistrar;

    @Test
    public void testTask() throws InterruptedException {
        SchedulingRunnable task = new SchedulingRunnable("demoTask", "taskNoParams", null);
        cronTaskRegistrar.addCronTask(task, "0/10 * * * * ?");

        // 便于观察
        Thread.sleep(3000000);
    }

    @Test
    public void testHaveParamsTask() throws InterruptedException {
        SchedulingRunnable task = new SchedulingRunnable("demoTask", "taskWithParams",null);
        cronTaskRegistrar.addCronTask(task, "0/10 * * * * ?");

        // 便于观察
        Thread.sleep(3000000);
    }
}