package com.example.schedule.controller;

import com.example.schedule.config.taskschedule.SchedulingRunnable;
import com.example.schedule.register.CronTaskRegistrar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Create by zhangz on 2021/1/11
 */
@RestController
public class ScheduleController {
    @Autowired
    CronTaskRegistrar cronTaskRegistrar;
    String cron = "0/10 * * * * ?";

    @PostMapping("/startTask")
    public String startTask(@RequestBody Map<String,Object> params){
        String beanName = (String) params.get("beanName");
        String methodName = (String) params.get("methodName");
        SchedulingRunnable task = new SchedulingRunnable(beanName,  methodName, null);
        cronTaskRegistrar.addCronTask(task,cron);
        return "定时任务："+ beanName + methodName + "---启动成功！";
    }

    /**
     *  移除定时任务
     * @param params
     * @return
     */
    @PostMapping("/removeTask")
    public String removeTask(@RequestBody Map<String,Object> params){
        String beanName = (String) params.get("beanName");
        String methodName = (String) params.get("methodName");
        SchedulingRunnable task = new SchedulingRunnable(beanName,  methodName, null);
        cronTaskRegistrar.removeCronTask(task);
        return "定时任务："+ beanName + methodName + "---移除成功！";
    }


}
