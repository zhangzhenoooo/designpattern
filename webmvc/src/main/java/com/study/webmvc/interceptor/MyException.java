package com.study.webmvc.interceptor;

/** 自定义异常实体类
 * Create by zhangz on 2021/1/4
 */
public class MyException extends  RuntimeException {
    private String code;
    private String message;
    private String url;


    public MyException(String code, String message, String url) {
        this.code = code;
        this.message = message;
        this.url = url;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
