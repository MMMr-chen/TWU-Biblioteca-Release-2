package com.twu.biblioteca.repository;

import com.twu.biblioteca.model.Movie;

import java.util.HashMap;
import java.util.Map;

public class MovieRepository {
    public Map<String, Movie> MOVIE_MAP = new HashMap<String , Movie>();

    public MovieRepository(){
        MOVIE_MAP.put("1", new Movie("1","<<Fellowship of the Ring>>","2001","Yaxuan Evans","0"));
        MOVIE_MAP.put("2",new Movie("2","<<Tom Sawyer>>","2015","Judy Li","10"));
        MOVIE_MAP.put("3",new Movie("3","<<Domain Driven Design>>","2003","Eric Evans","8"));
    }

    public  Map<String,Movie> getMovieMap(){
        return MOVIE_MAP;
    }
}
