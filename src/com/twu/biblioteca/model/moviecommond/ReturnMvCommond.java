package com.twu.biblioteca.model.moviecommond;

import com.twu.biblioteca.controller.Router;

public class ReturnMvCommond implements com.twu.biblioteca.model.MyCommand {
    @Override
    public String run(String command, Router router) {
        return null;
    }

    @Override
    public String getDescription() {
        return "Try to return book by enter 'rt movieid'";
    }
}
