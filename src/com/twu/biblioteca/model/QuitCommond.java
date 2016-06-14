package com.twu.biblioteca.model;

import com.twu.biblioteca.controller.Router;

import java.util.HashMap;
import java.util.Map;

public class QuitCommond implements MyCommand {

    @Override
    public String run(String command, Router router) {
        router.reset();
        return "";
    }

    @Override
    public String getDescription() {
        return "Quit";
    }
}
