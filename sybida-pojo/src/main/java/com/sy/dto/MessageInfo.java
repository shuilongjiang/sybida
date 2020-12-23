package com.sy.dto;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;
@Component
public class MessageInfo implements Serializable {
    private String userId;
    private List<Integer> list;
    private String messageInfo;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public String getMessageInfo() {
        return messageInfo;
    }

    public void setMessageInfo(String messageInfo) {
        this.messageInfo = messageInfo;
    }

    @Override
    public String toString() {
        return "MessageInfo{" +
                "userId='" + userId + '\'' +
                ", list=" + list +
                ", messageInfo='" + messageInfo + '\'' +
                '}';
    }
}
