package com.sy.dto;

import java.util.Date;

public class TeachDto {

    private Integer teachId;

    private String teachName;

    private String teachSex;

    private String teachPhoto;

    private Integer teachStudyId;

    private String teachTel;

    private String teachWechat;

    private String teachQq;

    private Date teachAlterTime;

    private String teachNull1;

    private String teachNull2;
    private Integer studyId;

    private String studyAspect;

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

    public String getTeachSex() {
        return teachSex;
    }

    public void setTeachSex(String teachSex) {
        this.teachSex = teachSex;
    }

    public String getTeachPhoto() {
        return teachPhoto;
    }

    public void setTeachPhoto(String teachPhoto) {
        this.teachPhoto = teachPhoto;
    }

    public Integer getTeachStudyId() {
        return teachStudyId;
    }

    public void setTeachStudyId(Integer teachStudyId) {
        this.teachStudyId = teachStudyId;
    }

    public String getTeachTel() {
        return teachTel;
    }

    public void setTeachTel(String teachTel) {
        this.teachTel = teachTel;
    }

    public String getTeachWechat() {
        return teachWechat;
    }

    public void setTeachWechat(String teachWechat) {
        this.teachWechat = teachWechat;
    }

    public String getTeachQq() {
        return teachQq;
    }

    public void setTeachQq(String teachQq) {
        this.teachQq = teachQq;
    }

    public Date getTeachAlterTime() {
        return teachAlterTime;
    }

    public void setTeachAlterTime(Date teachAlterTime) {
        this.teachAlterTime = teachAlterTime;
    }

    public String getTeachNull1() {
        return teachNull1;
    }

    public void setTeachNull1(String teachNull1) {
        this.teachNull1 = teachNull1;
    }

    public String getTeachNull2() {
        return teachNull2;
    }

    public void setTeachNull2(String teachNull2) {
        this.teachNull2 = teachNull2;
    }

    public Integer getStudyId() {
        return studyId;
    }

    public void setStudyId(Integer studyId) {
        this.studyId = studyId;
    }

    public String getStudyAspect() {
        return studyAspect;
    }

    public void setStudyAspect(String studyAspect) {
        this.studyAspect = studyAspect;
    }

    @Override
    public String toString() {
        return "TeachDto{" +
                "teachId=" + teachId +
                ", teachName='" + teachName + '\'' +
                ", teachSex='" + teachSex + '\'' +
                ", teachPhoto='" + teachPhoto + '\'' +
                ", teachStudyId=" + teachStudyId +
                ", teachTel='" + teachTel + '\'' +
                ", teachWechat='" + teachWechat + '\'' +
                ", teachQq='" + teachQq + '\'' +
                ", teachAlterTime=" + teachAlterTime +
                ", teachNull1='" + teachNull1 + '\'' +
                ", teachNull2='" + teachNull2 + '\'' +
                ", studyId=" + studyId +
                ", studyAspect='" + studyAspect + '\'' +
                '}';
    }
}
