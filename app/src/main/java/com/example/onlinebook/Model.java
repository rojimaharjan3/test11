package com.example.onlinebook;

public class Model {
    private String title;
    private String author;
    private String description;
    private int img;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getDescription(){return description; }

    public void setDescription(String description) {this.description = description;}
}
