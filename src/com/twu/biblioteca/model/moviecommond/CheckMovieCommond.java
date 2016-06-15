package com.twu.biblioteca.model.moviecommond;

import com.twu.biblioteca.controller.Router;
import com.twu.biblioteca.model.MyCommand;
import com.twu.biblioteca.repository.MovieRepository;
import com.twu.biblioteca.core.CheckOutMovie;

public class CheckMovieCommond implements MyCommand {
    private  MovieRepository movieRepository;

    public CheckMovieCommond(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public String run(String command, Router router) {
        return new CheckOutMovie(movieRepository).checkOut(command);
    }

    @Override
    public String getDescription() {
        return "Try to check out book by enter 'ck movieid'";
    }
}
