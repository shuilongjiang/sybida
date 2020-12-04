package com.sy.pojo;

import org.springframework.stereotype.Component;

@Component
public class UserInfo {

    private Integer id;
    private String name;
    private String power;
    private Integer messagenum;
    private String photoUrl;
    private Integer isLoginFirst;
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

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
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
