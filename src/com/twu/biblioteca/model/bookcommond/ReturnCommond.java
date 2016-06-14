package com.twu.biblioteca.model.bookcommond;

import com.twu.biblioteca.controller.Router;
import com.twu.biblioteca.model.MyCommand;
import com.twu.biblioteca.model.QuitCommond;

import java.util.HashMap;
import java.util.Map;

public class ReturnCommond implements MyCommand {
    private Map<String,MyCommand> returnRouter = new HashMap<String, MyCommand>(){{
        put("1",new QuitCommond());
        put("rt",new ReturnBookCommond());
    }};
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
