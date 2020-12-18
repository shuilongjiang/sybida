package com.sy.pojo;

public class PartStudent {
   private String classCreate;
   private String selectStudy;
   private String selectTeacher;
   private String insetManager;

    public String getClassCreate() {
        return classCreate;
    }

    public void setClassCreate(String classCreate) {
        this.classCreate = classCreate;
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

    public String getInsetManager() {
        return insetManager;
    }

    public void setInsetManager(String insetManager) {
        this.insetManager = insetManager;
    }

    @Override
    public String toString() {
        return "PartStudent{" +
                "classCreate='" + classCreate + '\'' +
                ", selectStudy='" + selectStudy + '\'' +
                ", selectTeacher='" + selectTeacher + '\'' +
                ", insetManager='" + insetManager + '\'' +
                '}';
    }
}
