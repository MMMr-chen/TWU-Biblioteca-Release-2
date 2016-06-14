package com.twu.biblioteca.model.bookcommond;

import com.twu.biblioteca.controller.Router;
import com.twu.biblioteca.core.CheckOutBook;
import com.twu.biblioteca.model.MyCommand;

public class CheckBookCommond implements MyCommand {
    @Override
    public String run(String command, Router router) {
        return new CheckOutBook().checkOut(command);
    }

    @Override
    public String getDescription() {
        return "Try to check out book by enter 'ck bookid'";
    }
}
