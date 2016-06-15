package com.twu.biblioteca.core;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.repository.MovieRepository;

import java.util.Map;

public class CheckOutMovie {
    private MovieRepository movieRepository;
    private Map<String, Movie> movieList;
    public CheckOutMovie(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
        movieList = this.movieRepository.getMovieMap();
    }

    public String checkOut(String command) {
        if (isValid(command)){
            movieList.get(command).setChecked(true);
        }else {
            return "That movie is not available.";
        };
        return "Thank you! Enjoy the movie";
    }

    private boolean isValid(String command) {
        return movieList.containsKey(command)&&!movieList.get(command).isChecked();
    }
}
