package com.fruit.utils;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;

/**
 * ${DESCRIPTION}
 *
 * @author 张进
 * @create 2017-10-16 20:07
 **/
public class ResponseVO {
    int status;
    String message;
    Object data;

    public ResponseVO(int status,String message,Object data) {
        this.data = data;
        this.status = status;
        this.message = message;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static String error(int status, String msg) {
        return JSON.toJSONString(new ResponseVO(status, msg, new HashMap<>(0)));
    }

}