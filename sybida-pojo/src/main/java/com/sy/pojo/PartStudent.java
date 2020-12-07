package com.sy.pojo;

public class PartStudent {
   private String selectClass;
   private String selectStudy;
   private String selectTeacher;

    public String getSelectClass() {
        return selectClass;
    }

    public void setSelectClass(String selectClass) {
        this.selectClass = selectClass;
    }

    public String getSelectStudy() {
        return selectStudy;
    }

    public void setSelectStudy(String selectStudy) {
        this.selectStudy = selectStudy;
    }

    public String getSelectTeacher() {
        return selectTeacher;
    }

    public void setSelectTeacher(String selectTeacher) {
        this.selectTeacher = selectTeacher;
    }

    @Override
    public String toString() {
        return "PartStudent{" +
                "selectClass='" + selectClass + '\'' +
                ", selectStudy='" + selectStudy + '\'' +
                ", selectTeacher='" + selectTeacher + '\'' +
                '}';
    }
}
