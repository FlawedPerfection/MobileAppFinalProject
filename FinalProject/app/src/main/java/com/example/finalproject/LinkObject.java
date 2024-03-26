package com.example.finalproject;

public class LinkObject {

    private long id;
    private String title;
    private String link;
    private String date;
    private String description;

    public LinkObject(long id, String title, String link, String date, String description){
        this.id = id;
        this.title = title;
        this.link = link;
        this.date = date;
        this.description = description;

    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
