package com.sy.dto;

import java.util.List;

public class LayuiData {
private Integer code=0;
private String msg;
private Integer count;
private List<SybidaStudentTotal> data;

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

    public List<SybidaStudentTotal> getData() {
        return data;
    }

    public void setData(List<SybidaStudentTotal> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "LayuiData{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                ", data=" + data +
                '}';
    }
}
