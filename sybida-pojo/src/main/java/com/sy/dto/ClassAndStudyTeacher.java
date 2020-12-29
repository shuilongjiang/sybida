package com.sy.dto;

import java.util.Date;

public class ClassAndStudyTeacher {
    private Integer classId;

    private String classNum;

    private Integer classTeachId;

    private Integer classManagerId;

    private Integer classStudyId;

    private Date classTime;

    private Byte classIsGraduate;

    private Date classAlterTime;

    private String classNull1;

    private String classNull2;

    private String tName;

    private String mName;

    private String studyAspect;

    public String getStudyAspect() {
        return studyAspect;
    }

    public void setStudyAspect(String studyAspect) {
        this.studyAspect = studyAspect;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public Integer getClassTeachId() {
        return classTeachId;
    }

    public void setClassTeachId(Integer classTeachId) {
        this.classTeachId = classTeachId;
    }

    public Integer getClassManagerId() {
        return classManagerId;
    }

    public void setClassManagerId(Integer classManagerId) {
        this.classManagerId = classManagerId;
    }

    public Integer getClassStudyId() {
        return classStudyId;
    }

    public void setClassStudyId(Integer classStudyId) {
        this.classStudyId = classStudyId;
    }

    public Date getClassTime() {
        return classTime;
    }

    public void setClassTime(Date classTime) {
        this.classTime = classTime;
    }

    public Byte getClassIsGraduate() {
        return classIsGraduate;
    }

    public void setClassIsGraduate(Byte classIsGraduate) {
        this.classIsGraduate = classIsGraduate;
    }

    public Date getClassAlterTime() {
        return classAlterTime;
    }

    public void setClassAlterTime(Date classAlterTime) {
        this.classAlterTime = classAlterTime;
    }

    public String getClassNull1() {
        return classNull1;
    }

    public void setClassNull1(String classNull1) {
        this.classNull1 = classNull1;
    }

    public String getClassNull2() {
        return classNull2;
    }

    public void setClassNull2(String classNull2) {
        this.classNull2 = classNull2;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    @Override
    public String toString() {
        return "ClassAndStudyTeacher{" +
                "classId=" + classId +
                ", classNum='" + classNum + '\'' +
                ", classTeachId=" + classTeachId +
                ", classManagerId=" + classManagerId +
                ", classStudyId=" + classStudyId +
                ", classTime=" + classTime +
                ", classIsGraduate=" + classIsGraduate +
                ", classAlterTime=" + classAlterTime +
                ", classNull1='" + classNull1 + '\'' +
                ", classNull2='" + classNull2 + '\'' +
                ", tName='" + tName + '\'' +
                ", mName='" + mName + '\'' +
                ", studyAspect='" + studyAspect + '\'' +
                '}';
    }
}

