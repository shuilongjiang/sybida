package com.sy.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SybidaOffer {
    private Integer offerId;

    private Integer offerStudentId;

    private Integer offerStudyId;

    private String offerCompany;

    private String offerContact;

    private String offerAddress;

    private String offerPracticeSalary;

    private String offerRegularSalary;

    private Date offerResponsetime;

    private Date offerHiredata;

    private Date offerPracticeEndtime;

    private String offerPicture;

    private Date offerAlterTime;

    private Byte offerIsexist;

    private Byte offerPersonisjob;

    private Byte offerIsjob;

    private String offerNull1;

    private String offerNull2;

    private String offerNull3;

    private String offerNull4;

    private String offerNull5;

    public Integer getOfferId() {
        return offerId;
    }

    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

    public Integer getOfferStudentId() {
        return offerStudentId;
    }

    public void setOfferStudentId(Integer offerStudentId) {
        this.offerStudentId = offerStudentId;
    }

    public Integer getOfferStudyId() {
        return offerStudyId;
    }

    public void setOfferStudyId(Integer offerStudyId) {
        this.offerStudyId = offerStudyId;
    }

    public String getOfferCompany() {
        return offerCompany;
    }

    public void setOfferCompany(String offerCompany) {
        this.offerCompany = offerCompany == null ? null : offerCompany.trim();
    }

    public String getOfferContact() {
        return offerContact;
    }

    public void setOfferContact(String offerContact) {
        this.offerContact = offerContact == null ? null : offerContact.trim();
    }

    public String getOfferAddress() {
        return offerAddress;
    }

    public void setOfferAddress(String offerAddress) {
        this.offerAddress = offerAddress == null ? null : offerAddress.trim();
    }

    public String getOfferPracticeSalary() {
        return offerPracticeSalary;
    }

    public void setOfferPracticeSalary(String offerPracticeSalary) {
        this.offerPracticeSalary = offerPracticeSalary == null ? null : offerPracticeSalary.trim();
    }

    public String getOfferRegularSalary() {
        return offerRegularSalary;
    }

    public void setOfferRegularSalary(String offerRegularSalary) {
        this.offerRegularSalary = offerRegularSalary == null ? null : offerRegularSalary.trim();
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getOfferResponsetime() {
        return offerResponsetime;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public void setOfferResponsetime(Date offerResponsetime) {
        this.offerResponsetime = offerResponsetime;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getOfferHiredata() {
        return offerHiredata;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public void setOfferHiredata(Date offerHiredata) {
        this.offerHiredata = offerHiredata;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getOfferPracticeEndtime() {
        return offerPracticeEndtime;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public void setOfferPracticeEndtime(Date offerPracticeEndtime) {
        this.offerPracticeEndtime = offerPracticeEndtime;
    }

    public String getOfferPicture() {
        return offerPicture;
    }

    public void setOfferPicture(String offerPicture) {
        this.offerPicture = offerPicture == null ? null : offerPicture.trim();
    }

    public Date getOfferAlterTime() {
        return offerAlterTime;
    }

    public void setOfferAlterTime(Date offerAlterTime) {
        this.offerAlterTime = offerAlterTime;
    }

    public Byte getOfferIsexist() {
        return offerIsexist;
    }

    public void setOfferIsexist(Byte offerIsexist) {
        this.offerIsexist = offerIsexist;
    }

    public Byte getOfferPersonisjob() {
        return offerPersonisjob;
    }

    public void setOfferPersonisjob(Byte offerPersonisjob) {
        this.offerPersonisjob = offerPersonisjob;
    }

    public Byte getOfferIsjob() {
        return offerIsjob;
    }

    public void setOfferIsjob(Byte offerIsjob) {
        this.offerIsjob = offerIsjob;
    }

    public String getOfferNull1() {
        return offerNull1;
    }

    public void setOfferNull1(String offerNull1) {
        this.offerNull1 = offerNull1 == null ? null : offerNull1.trim();
    }

    public String getOfferNull2() {
        return offerNull2;
    }

    public void setOfferNull2(String offerNull2) {
        this.offerNull2 = offerNull2 == null ? null : offerNull2.trim();
    }

    public String getOfferNull3() {
        return offerNull3;
    }

    public void setOfferNull3(String offerNull3) {
        this.offerNull3 = offerNull3 == null ? null : offerNull3.trim();
    }

    public String getOfferNull4() {
        return offerNull4;
    }

    public void setOfferNull4(String offerNull4) {
        this.offerNull4 = offerNull4 == null ? null : offerNull4.trim();
    }

    public String getOfferNull5() {
        return offerNull5;
    }

    public void setOfferNull5(String offerNull5) {
        this.offerNull5 = offerNull5 == null ? null : offerNull5.trim();
    }
}