package com.twu.biblioteca.model;

import com.twu.biblioteca.controller.Router;

public interface MyCommand {
    String run(String command, Router router);
    String getDescription();
}
