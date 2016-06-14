package com.twu.biblioteca.model.moviecommond;

import com.twu.biblioteca.controller.Router;
import com.twu.biblioteca.model.MyCommand;
import com.twu.biblioteca.repository.MovieRepository;

public class CheckOutMovieCommond implements MyCommand {
    private MovieRepository movieRepository;

    public CheckOutMovieCommond(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public String run(String command, Router router) {
        return null;
    }

    @Override
    public String getDescription() {
        return "CheckOutMovie";
    }
}
