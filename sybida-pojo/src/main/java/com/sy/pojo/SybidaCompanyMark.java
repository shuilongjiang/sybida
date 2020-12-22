package com.sy.pojo;

import java.util.Date;

public class SybidaCompanyMark {
    private Integer markId;

    private String markTeacherId;

    private String markErcodeId;

    private Date markAlterDate;

    private String markNull1;

    private String markNull2;

    public Integer getMarkId() {
        return markId;
    }

    public void setMarkId(Integer markId) {
        this.markId = markId;
    }

    public String getMarkTeacherId() {
        return markTeacherId;
    }

    public void setMarkTeacherId(String markTeacherId) {
        this.markTeacherId = markTeacherId == null ? null : markTeacherId.trim();
    }

    public String getMarkErcodeId() {
        return markErcodeId;
    }

    public void setMarkErcodeId(String markErcodeId) {
        this.markErcodeId = markErcodeId == null ? null : markErcodeId.trim();
    }

    public Date getMarkAlterDate() {
        return markAlterDate;
    }

    public void setMarkAlterDate(Date markAlterDate) {
        this.markAlterDate = markAlterDate;
    }

    public String getMarkNull1() {
        return markNull1;
    }

    public void setMarkNull1(String markNull1) {
        this.markNull1 = markNull1 == null ? null : markNull1.trim();
    }

    public String getMarkNull2() {
        return markNull2;
    }

    public void setMarkNull2(String markNull2) {
        this.markNull2 = markNull2 == null ? null : markNull2.trim();
    }
}