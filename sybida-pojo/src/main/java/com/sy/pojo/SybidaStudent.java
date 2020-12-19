package com.sy.pojo;

import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class SybidaStudent {
    private Integer studentId;

    private String studentName;

    private String studentSex;

    private String studentIdentity;

    private Byte studentIsGraduation;

    private String studentSchool;

    private String studentSpecialty;

    private String studentWechat;

    private String studentMailbox;

    private Integer studentStudyId;

    private String studentCity;

    private String studentAddress;

    private String studentParentPhone;

    private String studentParentName;

    private String studentUrgent;

    private String studentPhone;

    private Integer studentClassId;

    private String studentRoom;

    private String studentPhoto;

    private Date studentAlterTime;

    private String studentNull1;

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
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex == null ? null : studentSex.trim();
    }

    public String getStudentIdentity() {
        return studentIdentity;
    }

    public void setStudentIdentity(String studentIdentity) {
        this.studentIdentity = studentIdentity == null ? null : studentIdentity.trim();
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
        this.studentSchool = studentSchool == null ? null : studentSchool.trim();
    }

    public String getStudentSpecialty() {
        return studentSpecialty;
    }

    public void setStudentSpecialty(String studentSpecialty) {
        this.studentSpecialty = studentSpecialty == null ? null : studentSpecialty.trim();
    }

    public String getStudentWechat() {
        return studentWechat;
    }

    public void setStudentWechat(String studentWechat) {
        this.studentWechat = studentWechat == null ? null : studentWechat.trim();
    }

    public String getStudentMailbox() {
        return studentMailbox;
    }

    public void setStudentMailbox(String studentMailbox) {
        this.studentMailbox = studentMailbox == null ? null : studentMailbox.trim();
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
        this.studentCity = studentCity == null ? null : studentCity.trim();
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress == null ? null : studentAddress.trim();
    }

    public String getStudentParentPhone() {
        return studentParentPhone;
    }

    public void setStudentParentPhone(String studentParentPhone) {
        this.studentParentPhone = studentParentPhone == null ? null : studentParentPhone.trim();
    }

    public String getStudentParentName() {
        return studentParentName;
    }

    public void setStudentParentName(String studentParentName) {
        this.studentParentName = studentParentName == null ? null : studentParentName.trim();
    }

    public String getStudentUrgent() {
        return studentUrgent;
    }

    public void setStudentUrgent(String studentUrgent) {
        this.studentUrgent = studentUrgent == null ? null : studentUrgent.trim();
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone == null ? null : studentPhone.trim();
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
        this.studentRoom = studentRoom == null ? null : studentRoom.trim();
    }

    public String getStudentPhoto() {
        return studentPhoto;
    }

    public void setStudentPhoto(String studentPhoto) {
        this.studentPhoto = studentPhoto == null ? null : studentPhoto.trim();
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
        this.studentNull1 = studentNull1 == null ? null : studentNull1.trim();
    }

    public String getStudentNull2() {
        return studentNull2;
    }

    public void setStudentNull2(String studentNull2) {
        this.studentNull2 = studentNull2 == null ? null : studentNull2.trim();
    }

    @Override
    public String toString() {
        return "SybidaStudent{" +
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