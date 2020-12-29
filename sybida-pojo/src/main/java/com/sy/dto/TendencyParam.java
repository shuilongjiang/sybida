package com.sy.dto;

public class TendencyParam {
    private  String classNull1;
    private  Integer tName;
    private  Integer mName;
    private  Integer studyId;

    public Integer getStudyId() {
        return studyId;
    }

    public void setStudyId(Integer studyId) {
        this.studyId = studyId;
    }

    public String getClassNull1() {
        return classNull1;
    }

    public void setClassNull1(String classNull1) {
        this.classNull1 = classNull1;
    }

    public Integer gettName() {
        return tName;
    }

    public void settName(Integer tName) {
        this.tName = tName;
    }

    public Integer getmName() {
        return mName;
    }

    public void setmName(Integer mName) {
        this.mName = mName;
    }

    @Override
    public String toString() {
        return "TendencyParam{" +
                "classNull1='" + classNull1 + '\'' +
                ", tName=" + tName +
                ", mName=" + mName +
                ", studyId=" + studyId +
                '}';
    }
}
