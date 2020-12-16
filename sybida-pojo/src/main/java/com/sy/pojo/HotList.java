package com.sy.pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class HotList implements Serializable {
    private String studentName;
    private String jobWeal;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getJobWeal() {
        return jobWeal;
    }

    public void setJobWeal(String jobWeal) {
        this.jobWeal = jobWeal;
    }

    @Override
    public String toString() {
        return "HotList{" +
                "studentName='" + studentName + '\'' +
                ", jobWeal='" + jobWeal + '\'' +
                '}';
    }
}
