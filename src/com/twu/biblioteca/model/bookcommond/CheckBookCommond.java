package com.twu.biblioteca.model;

import com.twu.biblioteca.controller.Router;
import com.twu.biblioteca.core.CheckOutBook;
import com.twu.biblioteca.repository.BookRepository;

public class CheckBookCommond implements MyCommand {
    private BookRepository bookRepository;

    public CheckBookCommond(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public String run(String command, Router router) {
        return new CheckOutBook(bookRepository).checkOut(command);
    }

    @Override
    public String getDescription() {
        return "Try to check out book by enter 'ck bookid'";
    }
}
