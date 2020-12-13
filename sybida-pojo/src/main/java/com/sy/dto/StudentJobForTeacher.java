package com.sy.dto;

import java.util.Date;

public class StudentJobForTeacher {
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

    private String studentName;

    private String studyAspect;

    private String studentCity;

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
        this.jobFirm = jobFirm;
    }

    public String getJobContact() {
        return jobContact;
    }

    public void setJobContact(String jobContact) {
        this.jobContact = jobContact;
    }

    public String getJobWeal() {
        return jobWeal;
    }

    public void setJobWeal(String jobWeal) {
        this.jobWeal = jobWeal;
    }

    public Date getJobEndTime() {
        return jobEndTime;
    }

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
        this.jobPicture = jobPicture;
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
        this.jobNull1 = jobNull1;
    }

    public String getJobNull2() {
        return jobNull2;
    }

    public void setJobNull2(String jobNull2) {
        this.jobNull2 = jobNull2;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudyAspect() {
        return studyAspect;
    }

    public void setStudyAspect(String studyAspect) {
        this.studyAspect = studyAspect;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    @Override
    public String toString() {
        return "StudentJobForTeacher{" +
                "jobId=" + jobId +
                ", jobStudentId=" + jobStudentId +
                ", jobFirm='" + jobFirm + '\'' +
                ", jobContact='" + jobContact + '\'' +
                ", jobWeal='" + jobWeal + '\'' +
                ", jobEndTime=" + jobEndTime +
                ", jobStudyId=" + jobStudyId +
                ", jobPicture='" + jobPicture + '\'' +
                ", jobAlterTime=" + jobAlterTime +
                ", jobNull1='" + jobNull1 + '\'' +
                ", jobNull2='" + jobNull2 + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studyAspect='" + studyAspect + '\'' +
                ", studentCity='" + studentCity + '\'' +
                '}';
    }
}
