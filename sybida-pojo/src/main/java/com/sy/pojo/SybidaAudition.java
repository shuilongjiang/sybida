package com.sy.pojo;

import java.util.Date;

public class SybidaAudition {
    private Integer auditionId;

    private Integer auditionStudentId;

    private String auditionSite;

    private Date auditionTime;

    private String auditionSituation;

    private Integer auditionStudyId;

    private String auditionFinish;

    private String auditionFirm;

    private Date auditionAlterTime;

    private String auditionNull1;

    private String auditionNull2;

    public Integer getAuditionId() {
        return auditionId;
    }

    public void setAuditionId(Integer auditionId) {
        this.auditionId = auditionId;
    }

    public Integer getAuditionStudentId() {
        return auditionStudentId;
    }

    public void setAuditionStudentId(Integer auditionStudentId) {
        this.auditionStudentId = auditionStudentId;
    }

    public String getAuditionSite() {
        return auditionSite;
    }

    public void setAuditionSite(String auditionSite) {
        this.auditionSite = auditionSite == null ? null : auditionSite.trim();
    }

    public Date getAuditionTime() {
        return auditionTime;
    }

    public void setAuditionTime(Date auditionTime) {
        this.auditionTime = auditionTime;
    }

    public String getAuditionSituation() {
        return auditionSituation;
    }

    public void setAuditionSituation(String auditionSituation) {
        this.auditionSituation = auditionSituation == null ? null : auditionSituation.trim();
    }

    public Integer getAuditionStudyId() {
        return auditionStudyId;
    }

    public void setAuditionStudyId(Integer auditionStudyId) {
        this.auditionStudyId = auditionStudyId;
    }

    public String getAuditionFinish() {
        return auditionFinish;
    }

    public void setAuditionFinish(String auditionFinish) {
        this.auditionFinish = auditionFinish == null ? null : auditionFinish.trim();
    }

    public String getAuditionFirm() {
        return auditionFirm;
    }

    public void setAuditionFirm(String auditionFirm) {
        this.auditionFirm = auditionFirm == null ? null : auditionFirm.trim();
    }

    public Date getAuditionAlterTime() {
        return auditionAlterTime;
    }

    public void setAuditionAlterTime(Date auditionAlterTime) {
        this.auditionAlterTime = auditionAlterTime;
    }

    public String getAuditionNull1() {
        return auditionNull1;
    }

    public void setAuditionNull1(String auditionNull1) {
        this.auditionNull1 = auditionNull1 == null ? null : auditionNull1.trim();
    }

    public String getAuditionNull2() {
        return auditionNull2;
    }

    public void setAuditionNull2(String auditionNull2) {
        this.auditionNull2 = auditionNull2 == null ? null : auditionNull2.trim();
    }
}