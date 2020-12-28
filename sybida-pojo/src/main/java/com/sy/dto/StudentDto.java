package com.sy.dto;

import com.sy.pojo.SybidaStudent;

public class StudentDto extends SybidaStudent {

    private String classNum;

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }
}
