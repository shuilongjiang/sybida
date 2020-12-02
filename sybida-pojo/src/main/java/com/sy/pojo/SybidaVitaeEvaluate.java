package com.sy.pojo;

import java.util.Date;

public class SybidaVitaeEvaluate {
    private Integer vitaeEvaluateId;

    private String vitaeEvaluateComment;

    private Integer vitaeEvaluateUserId;

    private String vitaeEvaluatePicture;

    private Date vitaeEvaluateTime;

    private Date vitaeEvaluateAlterTime;

    private String vitaeEvaluateNull1;

    private String vitaeEvaluateNull2;

    public Integer getVitaeEvaluateId() {
        return vitaeEvaluateId;
    }

    public void setVitaeEvaluateId(Integer vitaeEvaluateId) {
        this.vitaeEvaluateId = vitaeEvaluateId;
    }

    public String getVitaeEvaluateComment() {
        return vitaeEvaluateComment;
    }

    public void setVitaeEvaluateComment(String vitaeEvaluateComment) {
        this.vitaeEvaluateComment = vitaeEvaluateComment == null ? null : vitaeEvaluateComment.trim();
    }

    public Integer getVitaeEvaluateUserId() {
        return vitaeEvaluateUserId;
    }

    public void setVitaeEvaluateUserId(Integer vitaeEvaluateUserId) {
        this.vitaeEvaluateUserId = vitaeEvaluateUserId;
    }

    public String getVitaeEvaluatePicture() {
        return vitaeEvaluatePicture;
    }

    public void setVitaeEvaluatePicture(String vitaeEvaluatePicture) {
        this.vitaeEvaluatePicture = vitaeEvaluatePicture == null ? null : vitaeEvaluatePicture.trim();
    }

    public Date getVitaeEvaluateTime() {
        return vitaeEvaluateTime;
    }

    public void setVitaeEvaluateTime(Date vitaeEvaluateTime) {
        this.vitaeEvaluateTime = vitaeEvaluateTime;
    }

    public Date getVitaeEvaluateAlterTime() {
        return vitaeEvaluateAlterTime;
    }

    public void setVitaeEvaluateAlterTime(Date vitaeEvaluateAlterTime) {
        this.vitaeEvaluateAlterTime = vitaeEvaluateAlterTime;
    }

    public String getVitaeEvaluateNull1() {
        return vitaeEvaluateNull1;
    }

    public void setVitaeEvaluateNull1(String vitaeEvaluateNull1) {
        this.vitaeEvaluateNull1 = vitaeEvaluateNull1 == null ? null : vitaeEvaluateNull1.trim();
    }

    public String getVitaeEvaluateNull2() {
        return vitaeEvaluateNull2;
    }

    public void setVitaeEvaluateNull2(String vitaeEvaluateNull2) {
        this.vitaeEvaluateNull2 = vitaeEvaluateNull2 == null ? null : vitaeEvaluateNull2.trim();
    }
}