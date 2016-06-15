package com.twu.biblioteca.model;

import com.twu.biblioteca.controller.Router;
import com.twu.biblioteca.core.ShowUser;

import java.util.HashMap;
import java.util.Map;

public class ShowUserCommond implements MyCommand {
    private User currentUser;
    private Map<String,MyCommand> returnRouter = new HashMap<String, MyCommand>();

    public ShowUserCommond(User currentUser) {
        this.currentUser = currentUser;
        returnRouter.put("1",new QuitCommond());
    }

    @Override
    public String run(String command, Router router) {
        router.setMapper(returnRouter);
        return new ShowUser().show(currentUser);
    }

    @Override
    public String getDescription() {
        return "ShowUser";
    }
}
