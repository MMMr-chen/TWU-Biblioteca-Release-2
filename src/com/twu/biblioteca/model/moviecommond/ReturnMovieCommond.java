package com.twu.biblioteca.model.moviecommond;

import com.twu.biblioteca.controller.Router;
import com.twu.biblioteca.model.MyCommand;
import com.twu.biblioteca.model.QuitCommond;
import com.twu.biblioteca.repository.MovieRepository;

import java.util.HashMap;
import java.util.Map;

public class ReturnMovieCommond implements MyCommand {
    private MovieRepository movieRepository;
    private Map<String,MyCommand> returnRouter = new HashMap<String, MyCommand>();

    public ReturnMovieCommond(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
        returnRouter.put("1",new QuitCommond());
        returnRouter.put("2",new ReturnMvCommond(movieRepository));
    }

    @Override
    public String run(String command, Router router) {
        router.setMapper(returnRouter);
        return "";
    }

    @Override
    public String getDescription() {
        return "ReturnMovieCommond";
    }
}
