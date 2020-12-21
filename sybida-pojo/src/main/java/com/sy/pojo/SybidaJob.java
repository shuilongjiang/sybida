package com.sy.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SybidaJob {
    private Integer jobId;

    private Integer jobStudentId;

    private String jobFirm;

    private String jobContact;

    private String jobWeal;

    private Date jobEndTime;

    private Integer jobStudyId;

    private String jobPicture;

    private Date jobAlterTime;

    private String jobNull1;

    private String jobNull2;

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Integer getJobStudentId() {
        return jobStudentId;
    }

    public void setJobStudentId(Integer jobStudentId) {
        this.jobStudentId = jobStudentId;
    }

    public String getJobFirm() {
        return jobFirm;
    }

    public void setJobFirm(String jobFirm) {
        this.jobFirm = jobFirm == null ? null : jobFirm.trim();
    }

    public String getJobContact() {
        return jobContact;
    }

    public void setJobContact(String jobContact) {
        this.jobContact = jobContact == null ? null : jobContact.trim();
    }

    public String getJobWeal() {
        return jobWeal;
    }

    public void setJobWeal(String jobWeal) {
        this.jobWeal = jobWeal == null ? null : jobWeal.trim();
    }


    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getJobEndTime() {
        return jobEndTime;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public void setJobEndTime(Date jobEndTime) {
        this.jobEndTime = jobEndTime;
    }

    public Integer getJobStudyId() {
        return jobStudyId;
    }

    public void setJobStudyId(Integer jobStudyId) {
        this.jobStudyId = jobStudyId;
    }

    public String getJobPicture() {
        return jobPicture;
    }

    public void setJobPicture(String jobPicture) {
        this.jobPicture = jobPicture == null ? null : jobPicture.trim();
    }

    public Date getJobAlterTime() {
        return jobAlterTime;
    }

    public void setJobAlterTime(Date jobAlterTime) {
        this.jobAlterTime = jobAlterTime;
    }

    public String getJobNull1() {
        return jobNull1;
    }

    public void setJobNull1(String jobNull1) {
        this.jobNull1 = jobNull1 == null ? null : jobNull1.trim();
    }

    public String getJobNull2() {
        return jobNull2;
    }

    public void setJobNull2(String jobNull2) {
        this.jobNull2 = jobNull2 == null ? null : jobNull2.trim();
    }
}