package com.twu.biblioteca.model.bookcommond;

import com.twu.biblioteca.controller.Router;
import com.twu.biblioteca.core.ListBooks;
import com.twu.biblioteca.model.MyCommand;
import com.twu.biblioteca.model.QuitCommond;

import java.util.HashMap;
import java.util.Map;

public class ListBookCommond implements MyCommand {
    private Map<String,MyCommand> returnRouter = new HashMap<String, MyCommand>(){{
        put("1",new QuitCommond());
    }};
    @Override
    public String run(String command, Router router) {
        router.setMapper(returnRouter);
        return new ListBooks().getString();
    }

    @Override
    public String getDescription() {
        return "ListBooks";
    }

}
