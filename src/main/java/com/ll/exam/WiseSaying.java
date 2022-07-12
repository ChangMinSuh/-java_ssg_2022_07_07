package com.ll.exam;

public class WiseSaying {
    private int id;
    private String author;
    private String content;

    public WiseSaying(int id, String content, String author){
        this.id = id;
        this.content = content;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " / " + author + " / " + content;
    }
}
