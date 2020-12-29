package com.sy.dto;

import java.util.List;

public class LayuiDataforallteacher {
private Integer code=0;
private String msg;
private Integer count;
private List<VitaeLevelForTeacher> data;

    @Override
    public String toString() {
        return "LayuiDataforallteacher{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                ", data=" + data +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<VitaeLevelForTeacher> getData() {
        return data;
    }

    public void setData(List<VitaeLevelForTeacher> data) {
        this.data = data;
    }
}
