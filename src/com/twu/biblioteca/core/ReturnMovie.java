package com.twu.biblioteca.core;

import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.repository.MovieRepository;

import java.util.Map;

public class ReturnMovie {
    private Map<String, Movie> movieList;
    private MovieRepository movieRepository;
    public ReturnMovie(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
        movieList = this.movieRepository.getMovieMap();
    }

    public String returnMovie(String command) {
        if (movieList.containsKey(command)&& movieList.get(command).isChecked()){
            movieList.get(command).setChecked(false);
        }else {
            return "That is not a valid movie to return.";
        };
        return "Thank you for returning the movie.";
    }
}
