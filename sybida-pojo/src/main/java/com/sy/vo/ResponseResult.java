package com.sy.vo;

import org.springframework.stereotype.Component;

@Component
public class ResponseResult {
    /**
     * code 返回的标识
     * 0:失败
     * 1：成功
     * 2：.....
     * 3:......
     */
    private Integer code = 1;
    /**
     * 标识描述信息
     */
    private String message = "success";
    /**
     * 返回的数据----任何的类型
     */
    private Object data;

    public ResponseResult(){

    }

    public ResponseResult(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
