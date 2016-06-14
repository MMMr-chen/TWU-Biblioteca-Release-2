package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.InValidCommond;
import com.twu.biblioteca.model.MyCommand;

import java.util.Map;

public class Router {
    private final Map<String, MyCommand> originRouter;
    private Map<String, MyCommand> currentRouter;

    public Router(Map<String, MyCommand> originRouter) {
        this.originRouter = originRouter;
        currentRouter=originRouter;
    }

    public MyCommand getCommand(String string) {
        if (currentRouter.containsKey(string)){
        return currentRouter.get(string);
        };
        return new InValidCommond();
    }

    public void setMapper(Map<String, MyCommand> mapper) {
        this.currentRouter = mapper;
    }

    public void reset() {
        currentRouter = originRouter;
    }

    public Map<String,MyCommand> getMapper() {
        return currentRouter;
    }
}
