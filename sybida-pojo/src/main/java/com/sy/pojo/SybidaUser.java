package com.sy.pojo;

import java.util.Date;

public class SybidaUser {
    private Integer userId;

    private String userName;

    private String userPhone;

    private String userPassword;

    private Integer userNote;

    private Byte userAuthority;

    private Date userAlterTime;

    private String userNull1;

    private String userNull2;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public Integer getUserNote() {
        return userNote;
    }

    public void setUserNote(Integer userNote) {
        this.userNote = userNote;
    }

    public Byte getUserAuthority() {
        return userAuthority;
    }

    public void setUserAuthority(Byte userAuthority) {
        this.userAuthority = userAuthority;
    }

    public Date getUserAlterTime() {
        return userAlterTime;
    }

    public void setUserAlterTime(Date userAlterTime) {
        this.userAlterTime = userAlterTime;
    }

    public String getUserNull1() {
        return userNull1;
    }

    public void setUserNull1(String userNull1) {
        this.userNull1 = userNull1 == null ? null : userNull1.trim();
    }

    public String getUserNull2() {
        return userNull2;
    }

    public void setUserNull2(String userNull2) {
        this.userNull2 = userNull2 == null ? null : userNull2.trim();
    }
}