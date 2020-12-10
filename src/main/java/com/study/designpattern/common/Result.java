package com.study.designpattern.common;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Create by zhangz on 2020/12/10
 */
@Data
public class Result<T> implements Serializable {
    private boolean isSuccess;
    private String code;
    private String message;
    private T date;

    public   Result(boolean isSuccess,String code,String message){
        this.isSuccess = isSuccess;
        this.code = code;
        this.message = message;
    }
    public  static  Result succeed (String message){
       return new Result(true,"0",message);
    }
    public  static  Result failed(String message){
        return new Result(false,"1",message);
    }

}
