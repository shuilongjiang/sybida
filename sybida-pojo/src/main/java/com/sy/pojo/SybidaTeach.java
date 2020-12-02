package com.sy.pojo;

import java.util.Date;

public class SybidaTeach {
    private Integer teachId;

    private String teachName;

    private String teachSex;

    private String teachPhoto;

    private Integer teachStudyId;

    private String teachTel;

    private String teachWechat;

    private String teachQq;

    private Date teachAlterTime;

    private String teachNull1;

    private String teachNull2;

    public Integer getTeachId() {
        return teachId;
    }

    public void setTeachId(Integer teachId) {
        this.teachId = teachId;
    }

    public String getTeachName() {
        return teachName;
    }

    public void setTeachName(String teachName) {
        this.teachName = teachName == null ? null : teachName.trim();
    }

    public String getTeachSex() {
        return teachSex;
    }

    public void setTeachSex(String teachSex) {
        this.teachSex = teachSex == null ? null : teachSex.trim();
    }

    public String getTeachPhoto() {
        return teachPhoto;
    }

    public void setTeachPhoto(String teachPhoto) {
        this.teachPhoto = teachPhoto == null ? null : teachPhoto.trim();
    }

    public Integer getTeachStudyId() {
        return teachStudyId;
    }

    public void setTeachStudyId(Integer teachStudyId) {
        this.teachStudyId = teachStudyId;
    }

    public String getTeachTel() {
        return teachTel;
    }

    public void setTeachTel(String teachTel) {
        this.teachTel = teachTel == null ? null : teachTel.trim();
    }

    public String getTeachWechat() {
        return teachWechat;
    }

    public void setTeachWechat(String teachWechat) {
        this.teachWechat = teachWechat == null ? null : teachWechat.trim();
    }

    public String getTeachQq() {
        return teachQq;
    }

    public void setTeachQq(String teachQq) {
        this.teachQq = teachQq == null ? null : teachQq.trim();
    }

    public Date getTeachAlterTime() {
        return teachAlterTime;
    }

    public void setTeachAlterTime(Date teachAlterTime) {
        this.teachAlterTime = teachAlterTime;
    }

    public String getTeachNull1() {
        return teachNull1;
    }

    public void setTeachNull1(String teachNull1) {
        this.teachNull1 = teachNull1 == null ? null : teachNull1.trim();
    }

    public String getTeachNull2() {
        return teachNull2;
    }

    public void setTeachNull2(String teachNull2) {
        this.teachNull2 = teachNull2 == null ? null : teachNull2.trim();
    }
}