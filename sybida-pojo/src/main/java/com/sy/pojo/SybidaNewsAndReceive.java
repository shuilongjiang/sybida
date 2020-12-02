package com.sy.pojo;

import java.util.Date;

public class SybidaNewsAndReceive {
    private Integer newsId;

    private Integer newsUserId;

    private String newsTest;

    private String newsPicture;

    private Date newsSendTime;

    private Integer newsReadPeople;

    private Date newsAlterTime;

    private String newsNull1;

    private String newsNull2;
    private Integer receiveId;

    private Integer receiveUserId;

    private Byte receiveIsRead;

    private Date receiveAlterTime;

    private String receiveNull1;

    private String receiveNull2;

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public Integer getNewsUserId() {
        return newsUserId;
    }

    public void setNewsUserId(Integer newsUserId) {
        this.newsUserId = newsUserId;
    }

    public String getNewsTest() {
        return newsTest;
    }

    public void setNewsTest(String newsTest) {
        this.newsTest = newsTest;
    }

    public String getNewsPicture() {
        return newsPicture;
    }

    public void setNewsPicture(String newsPicture) {
        this.newsPicture = newsPicture;
    }

    public Date getNewsSendTime() {
        return newsSendTime;
    }

    public void setNewsSendTime(Date newsSendTime) {
        this.newsSendTime = newsSendTime;
    }

    public Integer getNewsReadPeople() {
        return newsReadPeople;
    }

    public void setNewsReadPeople(Integer newsReadPeople) {
        this.newsReadPeople = newsReadPeople;
    }

    public Date getNewsAlterTime() {
        return newsAlterTime;
    }

    public void setNewsAlterTime(Date newsAlterTime) {
        this.newsAlterTime = newsAlterTime;
    }

    public String getNewsNull1() {
        return newsNull1;
    }

    public void setNewsNull1(String newsNull1) {
        this.newsNull1 = newsNull1;
    }

    public String getNewsNull2() {
        return newsNull2;
    }

    public void setNewsNull2(String newsNull2) {
        this.newsNull2 = newsNull2;
    }

    public Integer getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(Integer receiveId) {
        this.receiveId = receiveId;
    }

    public Integer getReceiveUserId() {
        return receiveUserId;
    }

    public void setReceiveUserId(Integer receiveUserId) {
        this.receiveUserId = receiveUserId;
    }

    public Byte getReceiveIsRead() {
        return receiveIsRead;
    }

    public void setReceiveIsRead(Byte receiveIsRead) {
        this.receiveIsRead = receiveIsRead;
    }

    public Date getReceiveAlterTime() {
        return receiveAlterTime;
    }

    public void setReceiveAlterTime(Date receiveAlterTime) {
        this.receiveAlterTime = receiveAlterTime;
    }

    public String getReceiveNull1() {
        return receiveNull1;
    }

    public void setReceiveNull1(String receiveNull1) {
        this.receiveNull1 = receiveNull1;
    }

    public String getReceiveNull2() {
        return receiveNull2;
    }

    public void setReceiveNull2(String receiveNull2) {
        this.receiveNull2 = receiveNull2;
    }

    @Override
    public String toString() {
        return "SybidaNewsAndReceive{" +
                "newsId=" + newsId +
                ", newsUserId=" + newsUserId +
                ", newsTest='" + newsTest + '\'' +
                ", newsPicture='" + newsPicture + '\'' +
                ", newsSendTime=" + newsSendTime +
                ", newsReadPeople=" + newsReadPeople +
                ", newsAlterTime=" + newsAlterTime +
                ", newsNull1='" + newsNull1 + '\'' +
                ", newsNull2='" + newsNull2 + '\'' +
                ", receiveId=" + receiveId +
                ", receiveUserId=" + receiveUserId +
                ", receiveIsRead=" + receiveIsRead +
                ", receiveAlterTime=" + receiveAlterTime +
                ", receiveNull1='" + receiveNull1 + '\'' +
                ", receiveNull2='" + receiveNull2 + '\'' +
                '}';
    }
}
