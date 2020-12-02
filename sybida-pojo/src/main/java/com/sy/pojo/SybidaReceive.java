package com.sy.pojo;

import java.util.Date;

public class SybidaReceive {
    private Integer receiveId;

    private Integer receiveUserId;

    private Byte receiveIsRead;

    private Date receiveAlterTime;

    private String receiveNull1;

    private String receiveNull2;

    public Integer getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(Integer receiveId) {
        this.receiveId = receiveId;
    }

    public Integer getReceiveUserId() {
        return receiveUserId;
    }

    public void setReceiveUserId(Integer receiveUserId) {
        this.receiveUserId = receiveUserId;
    }

    public Byte getReceiveIsRead() {
        return receiveIsRead;
    }

    public void setReceiveIsRead(Byte receiveIsRead) {
        this.receiveIsRead = receiveIsRead;
    }

    public Date getReceiveAlterTime() {
        return receiveAlterTime;
    }

    public void setReceiveAlterTime(Date receiveAlterTime) {
        this.receiveAlterTime = receiveAlterTime;
    }

    public String getReceiveNull1() {
        return receiveNull1;
    }

    public void setReceiveNull1(String receiveNull1) {
        this.receiveNull1 = receiveNull1 == null ? null : receiveNull1.trim();
    }

    public String getReceiveNull2() {
        return receiveNull2;
    }

    public void setReceiveNull2(String receiveNull2) {
        this.receiveNull2 = receiveNull2 == null ? null : receiveNull2.trim();
    }
}