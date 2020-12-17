package com.sy.pojo;

import com.jptangchina.jxcel.annotation.JxcelCell;

public class RegisterExcel {
    @JxcelCell("名字")
    private String name;
    @JxcelCell("手机号")
    private String phone;

    public boolean isNull(){
        if(name == null || phone == null ){
            return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "RegisterExcel{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
