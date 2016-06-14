package com.twu.biblioteca.model;

import com.twu.biblioteca.controller.Router;

public class InValidCommond implements MyCommand {
    @Override
    public String run(String command, Router router) {
        return "Select a valid option!";
    }

    @Override
    public String getDescription() {
        return null;
    }
}
