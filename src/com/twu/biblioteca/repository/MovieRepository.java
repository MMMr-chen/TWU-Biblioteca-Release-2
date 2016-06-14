package com.twu.biblioteca.repository;

import com.twu.biblioteca.model.Book;

import java.util.HashMap;
import java.util.Map;

public class MovieRepository {
    public static final Map<String, Book> MOVIE_MAP = new HashMap<String , Book>(){{
        put("1", new Book("1","<<Fellowship of the Ring>>","Yaxuan Evans","2001"));
        put("2",new Book("2","<<Tom Sawyer>>","Judy Li","2015"));
        put("3",new Book("3","<<Domain Driven Design>>","Eric Evans","2003"));


    }};
    public static Map<String,Book> getBookList(){
        return MOVIE_MAP;
    }
}
