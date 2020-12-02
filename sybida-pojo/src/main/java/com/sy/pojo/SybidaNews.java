package com.sy.pojo;

import java.util.Date;

public class SybidaNews {
    private Integer newsId;

    private Integer newsUserId;

    private String newsTest;

    private String newsPicture;

    private Date newsSendTime;

    private Integer newsReadPeople;

    private Date newsAlterTime;

    private String newsNull1;

    private String newsNull2;

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
        this.newsTest = newsTest == null ? null : newsTest.trim();
    }

    public String getNewsPicture() {
        return newsPicture;
    }

    public void setNewsPicture(String newsPicture) {
        this.newsPicture = newsPicture == null ? null : newsPicture.trim();
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
        this.newsNull1 = newsNull1 == null ? null : newsNull1.trim();
    }

    public String getNewsNull2() {
        return newsNull2;
    }

    public void setNewsNull2(String newsNull2) {
        this.newsNull2 = newsNull2 == null ? null : newsNull2.trim();
    }
}