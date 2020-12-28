package com.sy.dto;

import java.util.Date;

public class StudentVitae {
    private Integer vitaeEvaluateId;

    private String vitaeEvaluateComment;
    private String vitaeLevel;

    private Integer vitaeEvaluateUserId;

    private String vitaeEvaluatePicture;

    private Date vitaeEvaluateTime;

    private Date vitaeEvaluateAlterTime;

    private String vitaeUrl;

    private String vitaeAlterTime;

    private Byte vitaeIsRead;

    public Byte getVitaeIsRead() {
        return vitaeIsRead;
    }

    public void setVitaeIsRead(Byte vitaeIsRead) {
        this.vitaeIsRead = vitaeIsRead;
    }

    public String getVitaeAlterTime() {
        return vitaeAlterTime;
    }

    public void setVitaeAlterTime(String vitaeAlterTime) {
        this.vitaeAlterTime = vitaeAlterTime;
    }

    public String getVitaeUrl() {
        return vitaeUrl;
    }

    public void setVitaeUrl(String vitaeUrl) {
        this.vitaeUrl = vitaeUrl;
    }

    public String getVitaeLevel() {
        return vitaeLevel;
    }

    public void setVitaeLevel(String vitaeLevel) {
        this.vitaeLevel = vitaeLevel;
    }

    private String vitaeEvaluateNull1;

    private String vitaeEvaluateNull2;

    private Integer teachId;

    private String teachName;

    public Integer getTeachId() {
        return teachId;
    }

    public void setTeachId(Integer teachId) {
        this.teachId = teachId;
    }

    public String getTeachName() {
        return teachName;
    }

    public void setTeachName(String teachName) {
        this.teachName = teachName;
    }

    public String getStudyAspect() {
        return studyAspect;
    }

    public void setStudyAspect(String studyAspect) {
        this.studyAspect = studyAspect;
    }

    private Integer vitaeId;

    private Integer vitaeStudentId;

    private String studyAspect;

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
        this.vitaeEvaluateComment = vitaeEvaluateComment;
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
        this.vitaeEvaluatePicture = vitaeEvaluatePicture;
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
        this.vitaeEvaluateNull1 = vitaeEvaluateNull1;
    }

    public String getVitaeEvaluateNull2() {
        return vitaeEvaluateNull2;
    }

    public void setVitaeEvaluateNull2(String vitaeEvaluateNull2) {
        this.vitaeEvaluateNull2 = vitaeEvaluateNull2;
    }

    public Integer getVitaeId() {
        return vitaeId;
    }

    public void setVitaeId(Integer vitaeId) {
        this.vitaeId = vitaeId;
    }

    public Integer getVitaeStudentId() {
        return vitaeStudentId;
    }

    public void setVitaeStudentId(Integer vitaeStudentId) {
        this.vitaeStudentId = vitaeStudentId;
    }
}
