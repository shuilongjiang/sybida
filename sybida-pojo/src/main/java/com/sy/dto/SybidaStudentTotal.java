package com.sy.dto;

public class SybidaStudentTotal {
    private Integer num;
    private Integer studentId;
    private String studentName;
    //对学生的评价//学生级别
    private String studentNull1;
    //简历上传次数
    private Integer uploadNum;
    //简历评价次数
    private Integer evaNum;
    //学生Offer个数
    private Integer offerNum;
    //面试记录个数
    private Integer auditionNum;
    //是否就业
    private String haveJob;
    //合格简历
    private String isVeryGood;
    private String NullOne;
    private String NullTwo;
    private String NullThree;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNull1() {
        return studentNull1;
    }

    public void setStudentNull1(String studentNull1) {
        this.studentNull1 = studentNull1;
    }

    public Integer getUploadNum() {
        return uploadNum;
    }

    public void setUploadNum(Integer uploadNum) {
        this.uploadNum = uploadNum;
    }

    public Integer getEvaNum() {
        return evaNum;
    }

    public void setEvaNum(Integer evaNum) {
        this.evaNum = evaNum;
    }

    public Integer getOfferNum() {
        return offerNum;
    }

    public void setOfferNum(Integer offerNum) {
        this.offerNum = offerNum;
    }

    public Integer getAuditionNum() {
        return auditionNum;
    }

    public void setAuditionNum(Integer auditionNum) {
        this.auditionNum = auditionNum;
    }

    public String getHaveJob() {
        return haveJob;
    }

    public void setHaveJob(String haveJob) {
        this.haveJob = haveJob;
    }

    public String getIsVeryGood() {
        return isVeryGood;
    }

    public void setIsVeryGood(String isVeryGood) {
        this.isVeryGood = isVeryGood;
    }

    public String getNullOne() {
        return NullOne;
    }

    public void setNullOne(String nullOne) {
        NullOne = nullOne;
    }

    public String getNullTwo() {
        return NullTwo;
    }

    public void setNullTwo(String nullTwo) {
        NullTwo = nullTwo;
    }

    public String getNullThree() {
        return NullThree;
    }

    public void setNullThree(String nullThree) {
        NullThree = nullThree;
    }

    @Override
    public String toString() {
        return "SybidaStudentTotal{" +
                "num=" + num +
                ", studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentNull1='" + studentNull1 + '\'' +
                ", uploadNum=" + uploadNum +
                ", evaNum=" + evaNum +
                ", offerNum=" + offerNum +
                ", auditionNum=" + auditionNum +
                ", haveJob='" + haveJob + '\'' +
                ", isVeryGood='" + isVeryGood + '\'' +
                ", NullOne='" + NullOne + '\'' +
                ", NullTwo='" + NullTwo + '\'' +
                ", NullThree='" + NullThree + '\'' +
                '}';
    }
}
