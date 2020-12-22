package com.sy.dto;

import com.alibaba.excel.annotation.ExcelProperty;

import java.util.Date;

public class StudentExcel {
    @ExcelProperty("学生ID")
    private Integer studentId;
    @ExcelProperty("学生姓名")
    private String studentName;
    @ExcelProperty("学习性别")
    private String studentSex;
    @ExcelProperty("身份证号")
    private String studentIdentity;
    @ExcelProperty("是否毕业")
    private Byte studentIsGraduation;
    @ExcelProperty("毕业学校")
    private String studentSchool;
    @ExcelProperty("专业")
    private String studentSpecialty;
    @ExcelProperty("学生微信")
    private String studentWechat;
    @ExcelProperty("邮箱")
    private String studentMailbox;
    @ExcelProperty("学习方向")
    private Integer studentStudyId;
    @ExcelProperty("就业城市")
    private String studentCity;
    @ExcelProperty("家庭住址")
    private String studentAddress;
    @ExcelProperty("家长电话")
    private String studentParentPhone;
    @ExcelProperty("家长姓名")
    private String studentParentName;
    @ExcelProperty("紧急电话")
    private String studentUrgent;
    @ExcelProperty("学生电话")
    private String studentPhone;
    @ExcelProperty("学生班级")
    private Integer studentClassId;
    @ExcelProperty("学生寝室")
    private String studentRoom;
    @ExcelProperty("学生头像")
    private String studentPhoto;
    @ExcelProperty("修改时间")
    private Date studentAlterTime;
    @ExcelProperty("是否删除")
    private String studentNull1;
    @ExcelProperty("待定")
    private String studentNull2;

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

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public String getStudentIdentity() {
        return studentIdentity;
    }

    public void setStudentIdentity(String studentIdentity) {
        this.studentIdentity = studentIdentity;
    }

    public Byte getStudentIsGraduation() {
        return studentIsGraduation;
    }

    public void setStudentIsGraduation(Byte studentIsGraduation) {
        this.studentIsGraduation = studentIsGraduation;
    }

    public String getStudentSchool() {
        return studentSchool;
    }

    public void setStudentSchool(String studentSchool) {
        this.studentSchool = studentSchool;
    }

    public String getStudentSpecialty() {
        return studentSpecialty;
    }

    public void setStudentSpecialty(String studentSpecialty) {
        this.studentSpecialty = studentSpecialty;
    }

    public String getStudentWechat() {
        return studentWechat;
    }

    public void setStudentWechat(String studentWechat) {
        this.studentWechat = studentWechat;
    }

    public String getStudentMailbox() {
        return studentMailbox;
    }

    public void setStudentMailbox(String studentMailbox) {
        this.studentMailbox = studentMailbox;
    }

    public Integer getStudentStudyId() {
        return studentStudyId;
    }

    public void setStudentStudyId(Integer studentStudyId) {
        this.studentStudyId = studentStudyId;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentParentPhone() {
        return studentParentPhone;
    }

    public void setStudentParentPhone(String studentParentPhone) {
        this.studentParentPhone = studentParentPhone;
    }

    public String getStudentParentName() {
        return studentParentName;
    }

    public void setStudentParentName(String studentParentName) {
        this.studentParentName = studentParentName;
    }

    public String getStudentUrgent() {
        return studentUrgent;
    }

    public void setStudentUrgent(String studentUrgent) {
        this.studentUrgent = studentUrgent;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public Integer getStudentClassId() {
        return studentClassId;
    }

    public void setStudentClassId(Integer studentClassId) {
        this.studentClassId = studentClassId;
    }

    public String getStudentRoom() {
        return studentRoom;
    }

    public void setStudentRoom(String studentRoom) {
        this.studentRoom = studentRoom;
    }

    public String getStudentPhoto() {
        return studentPhoto;
    }

    public void setStudentPhoto(String studentPhoto) {
        this.studentPhoto = studentPhoto;
    }

    public Date getStudentAlterTime() {
        return studentAlterTime;
    }

    public void setStudentAlterTime(Date studentAlterTime) {
        this.studentAlterTime = studentAlterTime;
    }

    public String getStudentNull1() {
        return studentNull1;
    }

    public void setStudentNull1(String studentNull1) {
        this.studentNull1 = studentNull1;
    }

    public String getStudentNull2() {
        return studentNull2;
    }

    public void setStudentNull2(String studentNull2) {
        this.studentNull2 = studentNull2;
    }

    @Override
    public String toString() {
        return "StudentExcel{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentSex='" + studentSex + '\'' +
                ", studentIdentity='" + studentIdentity + '\'' +
                ", studentIsGraduation=" + studentIsGraduation +
                ", studentSchool='" + studentSchool + '\'' +
                ", studentSpecialty='" + studentSpecialty + '\'' +
                ", studentWechat='" + studentWechat + '\'' +
                ", studentMailbox='" + studentMailbox + '\'' +
                ", studentStudyId=" + studentStudyId +
                ", studentCity='" + studentCity + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentParentPhone='" + studentParentPhone + '\'' +
                ", studentParentName='" + studentParentName + '\'' +
                ", studentUrgent='" + studentUrgent + '\'' +
                ", studentPhone='" + studentPhone + '\'' +
                ", studentClassId=" + studentClassId +
                ", studentRoom='" + studentRoom + '\'' +
                ", studentPhoto='" + studentPhoto + '\'' +
                ", studentAlterTime=" + studentAlterTime +
                ", studentNull1='" + studentNull1 + '\'' +
                ", studentNull2='" + studentNull2 + '\'' +
                '}';
    }
}
