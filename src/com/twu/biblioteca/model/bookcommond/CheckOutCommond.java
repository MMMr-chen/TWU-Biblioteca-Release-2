package com.twu.biblioteca.model.bookcommond;

import com.twu.biblioteca.controller.Router;
import com.twu.biblioteca.model.CheckBookCommond;
import com.twu.biblioteca.model.MyCommand;
import com.twu.biblioteca.model.QuitCommond;
import com.twu.biblioteca.repository.BookRepository;

import java.util.HashMap;
import java.util.Map;

public class CheckOutCommond implements MyCommand {
    private BookRepository bookRepository;
    private Map<String,MyCommand> returnRouter = new HashMap<String, MyCommand>();

    public CheckOutCommond(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        returnRouter.put("1",new QuitCommond());
        returnRouter.put("ck",new CheckBookCommond(bookRepository));
    }

    @Override
    public String run(String command, Router router) {
        router.setMapper(returnRouter);
        return "";
    }

    @Override
    public String getDescription() {
        return "CheckOutBook";
    }

}
