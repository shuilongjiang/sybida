package com.sy.pojo;

import org.springframework.stereotype.Component;

@Component
public class UserInfo {

    private Integer id;
    private String name;
    private Byte power;
    private Integer messagenum;
    private String photoUrl;
    private Integer isLoginFirst;

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", power=" + power +
                ", messagenum=" + messagenum +
                ", photoUrl='" + photoUrl + '\'' +
                ", isLoginFirst=" + isLoginFirst +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getPower() {
        return power;
    }

    public void setPower(Byte power) {
        this.power = power;
    }

    public Integer getMessagenum() {
        return messagenum;
    }

    public void setMessagenum(Integer messagenum) {
        this.messagenum = messagenum;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public Integer getIsLoginFirst() {
        return isLoginFirst;
    }

    public void setIsLoginFirst(Integer isLoginFirst) {
        this.isLoginFirst = isLoginFirst;
    }
}
