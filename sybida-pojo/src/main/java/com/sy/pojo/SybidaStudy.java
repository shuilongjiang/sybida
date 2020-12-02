package com.sy.pojo;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class SybidaStudy {
    private Integer studyId;

    private String studyAspect;

    private String studyIntroduce;

    private Byte userAuthority;

    private Date studyAlterTime;

    private String studyNull1;

    private String studyNull2;

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
        this.studyAspect = studyAspect == null ? null : studyAspect.trim();
    }

    public String getStudyIntroduce() {
        return studyIntroduce;
    }

    public void setStudyIntroduce(String studyIntroduce) {
        this.studyIntroduce = studyIntroduce == null ? null : studyIntroduce.trim();
    }

    public Byte getUserAuthority() {
        return userAuthority;
    }

    public void setUserAuthority(Byte userAuthority) {
        this.userAuthority = userAuthority;
    }

    public Date getStudyAlterTime() {
        return studyAlterTime;
    }

    public void setStudyAlterTime(Date studyAlterTime) {
        this.studyAlterTime = studyAlterTime;
    }

    public String getStudyNull1() {
        return studyNull1;
    }

    public void setStudyNull1(String studyNull1) {
        this.studyNull1 = studyNull1 == null ? null : studyNull1.trim();
    }

    public String getStudyNull2() {
        return studyNull2;
    }

    public void setStudyNull2(String studyNull2) {
        this.studyNull2 = studyNull2 == null ? null : studyNull2.trim();
    }
}