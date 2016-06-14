package com.twu.biblioteca.model;

public class Book {
    private String id;
    private String title;
    private String author;
    private String yearPublished;
    private boolean checked;
    public Book(String id,String title,String author,String yearPublished){
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.checked = false;
    }

    public String getYearPublished() {
        return yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getId() {
        return id;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
