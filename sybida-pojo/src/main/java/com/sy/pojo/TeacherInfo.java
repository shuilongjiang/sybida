package com.sy.pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component
public class TeacherInfo implements Serializable {
    private Integer userId;
    private String teachName;
    private Byte userAuthority;
    private String teachPhoto;
    private Integer messageNum;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTeachName() {
        return teachName;
    }

    public void setTeachName(String teachName) {
        this.teachName = teachName;
    }

    public Byte getUserAuthority() {
        return userAuthority;
    }

    public void setUserAuthority(Byte userAuthority) {
        this.userAuthority = userAuthority;
    }

    public String getTeachPhoto() {
        return teachPhoto;
    }

    public void setTeachPhoto(String teachPhoto) {
        this.teachPhoto = teachPhoto;
    }

    public Integer getMessageNum() {
        return messageNum;
    }

    public void setMessageNum(Integer messageNum) {
        this.messageNum = messageNum;
    }

    @Override
    public String toString() {
        return "TeacherInfo{" +
                "userId=" + userId +
                ", teachName='" + teachName + '\'' +
                ", userAuthority=" + userAuthority +
                ", teachPhoto='" + teachPhoto + '\'' +
                ", messageNum=" + messageNum +
                '}';
    }
}
