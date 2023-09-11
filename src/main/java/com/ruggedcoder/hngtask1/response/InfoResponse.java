package com.ruggedcoder.hngtask1.response;


public class InfoResponse {
    private String slackName;
    private String currentDay;
    private String UtcTime;
    private String track;
    private String githubFileUrl;
    private String githubRepoUrl;
    private int statusCode;

    public InfoResponse() {
    }

    public String getSlackName() {
        return this.slackName;
    }

    public void setSlackName(String slackName) {
        this.slackName = slackName;
    }

    public String getCurrentDay() {
        return this.currentDay;
    }

    public void setCurrentDay(String currentDay) {
        this.currentDay = currentDay;
    }

    public String getUtcTime() {
        return this.UtcTime;
    }

    public void setUtcTime(String utcTime) {
        this.UtcTime = utcTime;
    }

    public String getTrack() {
        return this.track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public String getGithubFileUrl() {
        return this.githubFileUrl;
    }

    public void setGithubFileUrl(String githubFileUrl) {
        this.githubFileUrl = githubFileUrl;
    }

    public String getGithubRepoUrl() {
        return this.githubRepoUrl;
    }

    public void setGithubRepoUrl(String githubRepoUrl) {
        this.githubRepoUrl = githubRepoUrl;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
