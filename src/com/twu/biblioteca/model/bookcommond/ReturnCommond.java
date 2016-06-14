package com.twu.biblioteca.model;

import com.twu.biblioteca.controller.Router;
import com.twu.biblioteca.repository.BookRepository;

import java.util.HashMap;
import java.util.Map;

public class ReturnCommond implements MyCommand {
    private BookRepository bookRepository;
    private Map<String,MyCommand> returnRouter = new HashMap<String, MyCommand>(){{
        put("1",new QuitCommond());
        put("rt",new ReturnBookCommond(bookRepository));
    }};

    public ReturnCommond(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public String run(String command, Router router) {
        router.setMapper(returnRouter);
        return "";
    }

    @Override
    public String getDescription() {
        return "ReturnBook";
    }
}
