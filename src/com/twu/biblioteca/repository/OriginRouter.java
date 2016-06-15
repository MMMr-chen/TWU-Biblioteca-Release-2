package com.twu.biblioteca.repository;

import com.twu.biblioteca.model.ListBookCommond;
import com.twu.biblioteca.model.MyCommand;
import com.twu.biblioteca.model.bookcommond.CheckOutCommond;
import com.twu.biblioteca.model.bookcommond.ReturnCommond;
import com.twu.biblioteca.model.moviecommond.CheckOutMovieCommond;
import com.twu.biblioteca.model.moviecommond.ListMovieCommond;
import com.twu.biblioteca.model.moviecommond.ReturnMovieCommond;

import java.util.HashMap;
import java.util.Map;

public class OriginRouter {
    private Map<String,MyCommand> ORIGIN_ROUTER = new HashMap<String, MyCommand>();
    public OriginRouter(BookRepository bookRepository, MovieRepository movieRepository){
        ORIGIN_ROUTER.put("1",new ListBookCommond(bookRepository));
        ORIGIN_ROUTER.put("2",new CheckOutCommond(bookRepository));
        ORIGIN_ROUTER.put("3",new ReturnCommond(bookRepository));
        ORIGIN_ROUTER.put("4",new ListMovieCommond(movieRepository));
        ORIGIN_ROUTER.put("5",new CheckOutMovieCommond(movieRepository));
        ORIGIN_ROUTER.put("6",new ReturnMovieCommond(movieRepository));
    }
    public Map<String, MyCommand> getOriginRouter(){
        return ORIGIN_ROUTER;
    }
}
