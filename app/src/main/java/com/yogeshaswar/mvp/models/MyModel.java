package com.yogeshaswar.mvp.models;

public class MyModel {
    private String appName;
    private int appDownloads;
    private String appRating;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public int getAppDownloads() {
        return appDownloads;
    }

    public void setAppDownloads(int appDownloads) {
        this.appDownloads = appDownloads;
    }

    public String getAppRating() {
        return appRating;
    }

    public void setAppRating(String appRating) {
        this.appRating = appRating;
    }

    public MyModel(String appName, int appDownloads, String appRating) {
        this.appName = appName;
        this.appDownloads = appDownloads;
        this.appRating = appRating;
    }
}
