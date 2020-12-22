package com.sy.pojo;

import java.util.Date;

public class SybidaOffer {
    private Integer offerId;

    private Integer offerStudentId;

    private String offerCompany;

    private String offerContact;

    private String offerAddress;

    private Integer offerStudyId;

    private Date offerDatetime;

    private String offerPracticeSalary;

    private String offerReallySalary;

    private Date offerHiredate;

    private Date offerAlterTime;

    private String offerNull1;

    private String offerNull2;

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

    public Integer getOfferStudyId() {
        return offerStudyId;
    }

    public void setOfferStudyId(Integer offerStudyId) {
        this.offerStudyId = offerStudyId;
    }

    public Date getOfferDatetime() {
        return offerDatetime;
    }

    public void setOfferDatetime(Date offerDatetime) {
        this.offerDatetime = offerDatetime;
    }

    public String getOfferPracticeSalary() {
        return offerPracticeSalary;
    }

    public void setOfferPracticeSalary(String offerPracticeSalary) {
        this.offerPracticeSalary = offerPracticeSalary == null ? null : offerPracticeSalary.trim();
    }

    public String getOfferReallySalary() {
        return offerReallySalary;
    }

    public void setOfferReallySalary(String offerReallySalary) {
        this.offerReallySalary = offerReallySalary == null ? null : offerReallySalary.trim();
    }

    public Date getOfferHiredate() {
        return offerHiredate;
    }

    public void setOfferHiredate(Date offerHiredate) {
        this.offerHiredate = offerHiredate;
    }

    public Date getOfferAlterTime() {
        return offerAlterTime;
    }

    public void setOfferAlterTime(Date offerAlterTime) {
        this.offerAlterTime = offerAlterTime;
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
}