package com.twu.biblioteca.model.moviecommond;

import com.twu.biblioteca.controller.Router;
import com.twu.biblioteca.core.ListMovies;
import com.twu.biblioteca.model.MyCommand;
import com.twu.biblioteca.model.QuitCommond;
import com.twu.biblioteca.repository.MovieRepository;

import java.util.HashMap;
import java.util.Map;

public class ListMovieCommond implements MyCommand {
    private MovieRepository movieRepository;

    public ListMovieCommond(MovieRepository movieRepository) {
        this.movieRepository =movieRepository;
    }
    private Map<String,MyCommand> returnRouter = new HashMap<String, MyCommand>(){{
        put("1",new QuitCommond());
    }};

    @Override
    public String run(String command, Router router) {
        router.setMapper(returnRouter);
        return new ListMovies(movieRepository).getList();
    }

    @Override
    public String getDescription() {
        return "ListMovies";
    }
}
