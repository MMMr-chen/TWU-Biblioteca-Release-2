package com.twu.biblioteca.model;

public class Movie {
    private String rating;
    private String year;
    private String director;
    private String name;
    private boolean isChecked;

    public Movie(String name, String year, String director, String rating){
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
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
}
