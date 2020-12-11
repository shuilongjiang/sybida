package com.sy.pojo;


import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class StudentInfo implements Serializable {
    private Integer userId;
    private String studentName;
    private Byte userAuthority;
    private String studentPhoto;
    private Integer messageNum;
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Byte getUserAuthority() {
        return userAuthority;
    }

    public void setUserAuthority(Byte userAuthority) {
        this.userAuthority = userAuthority;
    }

    public String getStudentPhoto() {
        return studentPhoto;
    }

    public void setStudentPhoto(String studentPhoto) {
        this.studentPhoto = studentPhoto;
    }

    public Integer getMessageNum() {
        return messageNum;
    }

    public void setMessageNum(Integer messageNum) {
        this.messageNum = messageNum;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "userId=" + userId +
                ", studentName='" + studentName + '\'' +
                ", userAuthority=" + userAuthority +
                ", studentPhoto='" + studentPhoto + '\'' +
                ", messageNum=" + messageNum +
                '}';
    }
}
