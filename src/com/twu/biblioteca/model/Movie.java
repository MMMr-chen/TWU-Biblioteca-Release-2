package com.twu.biblioteca.model;

public class Movie {
    private String id;
    private String rating;
    private String year;
    private String director;
    private String name;
    private boolean isChecked;

    public Movie(String id ,String name, String year, String director, String rating){
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.id = id;
        this.isChecked = false;

    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public String getYear() {
        return year;
    }

    public String getRating() {
        return rating;
    }

    public String getId() {
        return id;
    }
}
