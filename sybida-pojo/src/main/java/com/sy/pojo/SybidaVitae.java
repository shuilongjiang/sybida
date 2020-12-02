package com.sy.pojo;

import java.util.Date;

public class SybidaVitae {
    private Integer vitaeId;

    private Integer vitaeStudentId;

    private Integer vitaeStudyId;

    private String vitaeLevel;

    private Integer vitaeIsNew;

    private String vitaeUrl;

    private Byte vitaeIsRead;

    private Integer vitaeDownloadFrequency;

    private Integer vitaeHistoryFrequency;

    private Date vitaeAlterTime;

    private String vitaeNull1;

    private String vitaeNull2;

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

    public Integer getVitaeStudyId() {
        return vitaeStudyId;
    }

    public void setVitaeStudyId(Integer vitaeStudyId) {
        this.vitaeStudyId = vitaeStudyId;
    }

    public String getVitaeLevel() {
        return vitaeLevel;
    }

    public void setVitaeLevel(String vitaeLevel) {
        this.vitaeLevel = vitaeLevel == null ? null : vitaeLevel.trim();
    }

    public Integer getVitaeIsNew() {
        return vitaeIsNew;
    }

    public void setVitaeIsNew(Integer vitaeIsNew) {
        this.vitaeIsNew = vitaeIsNew;
    }

    public String getVitaeUrl() {
        return vitaeUrl;
    }

    public void setVitaeUrl(String vitaeUrl) {
        this.vitaeUrl = vitaeUrl == null ? null : vitaeUrl.trim();
    }

    public Byte getVitaeIsRead() {
        return vitaeIsRead;
    }

    public void setVitaeIsRead(Byte vitaeIsRead) {
        this.vitaeIsRead = vitaeIsRead;
    }

    public Integer getVitaeDownloadFrequency() {
        return vitaeDownloadFrequency;
    }

    public void setVitaeDownloadFrequency(Integer vitaeDownloadFrequency) {
        this.vitaeDownloadFrequency = vitaeDownloadFrequency;
    }

    public Integer getVitaeHistoryFrequency() {
        return vitaeHistoryFrequency;
    }

    public void setVitaeHistoryFrequency(Integer vitaeHistoryFrequency) {
        this.vitaeHistoryFrequency = vitaeHistoryFrequency;
    }

    public Date getVitaeAlterTime() {
        return vitaeAlterTime;
    }

    public void setVitaeAlterTime(Date vitaeAlterTime) {
        this.vitaeAlterTime = vitaeAlterTime;
    }

    public String getVitaeNull1() {
        return vitaeNull1;
    }

    public void setVitaeNull1(String vitaeNull1) {
        this.vitaeNull1 = vitaeNull1 == null ? null : vitaeNull1.trim();
    }

    public String getVitaeNull2() {
        return vitaeNull2;
    }

    public void setVitaeNull2(String vitaeNull2) {
        this.vitaeNull2 = vitaeNull2 == null ? null : vitaeNull2.trim();
    }
}