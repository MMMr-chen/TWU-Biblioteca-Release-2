package com.twu.biblioteca.model.moviecommond;

import com.twu.biblioteca.controller.Router;
import com.twu.biblioteca.core.ReturnMovie;
import com.twu.biblioteca.repository.MovieRepository;

public class ReturnMvCommond implements com.twu.biblioteca.model.MyCommand {
    private MovieRepository movieRepository;

    public ReturnMvCommond(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public String run(String command, Router router) {
        return new ReturnMovie(movieRepository).returnMovie(command);
    }

    @Override
    public String getDescription() {
        return "Try to return book by enter 'rt movieid'";
    }
}
