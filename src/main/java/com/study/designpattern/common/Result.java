package com.study.designpattern.common;

import java.io.Serializable;
import java.util.List;

/**
 * Create by zhangz on 2020/12/10
 */
public class Result implements Serializable {
    private String code;
    private String message;
    private List date;

    public Result success(String code,String message){
        this.code = code;
        this.message = message;
        return this;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
