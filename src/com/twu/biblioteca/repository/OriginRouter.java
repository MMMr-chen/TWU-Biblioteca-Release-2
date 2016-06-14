package com.twu.biblioteca.repository;

import com.twu.biblioteca.model.*;

import java.util.HashMap;
import java.util.Map;

public class OriginRouter {
    private Map<String,MyCommand> ORIGIN_ROUTER = new HashMap<String, MyCommand>();
    public OriginRouter(BookRepository bookRepository){
        ORIGIN_ROUTER.put("1",new ListBookCommond(bookRepository));
        ORIGIN_ROUTER.put("2",new CheckOutCommond(bookRepository));
        ORIGIN_ROUTER.put("3",new ReturnCommond(bookRepository));
    }
    public Map<String, MyCommand> getOriginRouter(){
        return ORIGIN_ROUTER;
    }
}
