package com.sy.dto;

import java.util.Date;

public class ShowClassInfo {
    private Integer classId;

    private String classNum;

    private Integer classTeachId;

    private String  classTeachName;

    private Integer classManagerId;

    private String classManagerName;

    private Integer classStudyId;

    private String classStudyName;

    private Date classTime;

    private Byte classIsGraduate;

    private Date classAlterTime;

    private String classNull1;

    private String classNull2;

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

    public String getClassTeachName() {
        return classTeachName;
    }

    public void setClassTeachName(String classTeachName) {
        this.classTeachName = classTeachName;
    }

    public Integer getClassManagerId() {
        return classManagerId;
    }

    public void setClassManagerId(Integer classManagerId) {
        this.classManagerId = classManagerId;
    }

    public String getClassManagerName() {
        return classManagerName;
    }

    public void setClassManagerName(String classManagerName) {
        this.classManagerName = classManagerName;
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

    public String getClassStudyName() {
        return classStudyName;
    }

    public void setClassStudyName(String classStudyName) {
        this.classStudyName = classStudyName;
    }

    @Override
    public String toString() {
        return "ShowClassInfo{" +
                "classId=" + classId +
                ", classNum='" + classNum + '\'' +
                ", classTeachId=" + classTeachId +
                ", classTeachName='" + classTeachName + '\'' +
                ", classManagerId=" + classManagerId +
                ", classManagerName='" + classManagerName + '\'' +
                ", classStudyId=" + classStudyId +
                ", classStudyName='" + classStudyName + '\'' +
                ", classTime=" + classTime +
                ", classIsGraduate=" + classIsGraduate +
                ", classAlterTime=" + classAlterTime +
                ", classNull1='" + classNull1 + '\'' +
                ", classNull2='" + classNull2 + '\'' +
                '}';
    }
}
