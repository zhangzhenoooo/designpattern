package com.study.designpattern.structure.adapter.design;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class RebateInfo {
  private   SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private String userId; // ⽤户ID
    private String bizId; // 业务ID
    private Date bizTime; // 业务时间
    private String desc; // 业务描述

 // ... get/set


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public Date getBizTime() {
        return bizTime;
    }

    public void setBizTime(String  bizTime) {
        this.bizTime = new Date(Long.parseLong(bizTime));
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}