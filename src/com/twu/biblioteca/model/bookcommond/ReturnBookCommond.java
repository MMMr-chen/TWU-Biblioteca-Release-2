package com.twu.biblioteca.model;

import com.twu.biblioteca.controller.Router;
import com.twu.biblioteca.core.ReturnBook;
import com.twu.biblioteca.repository.BookRepository;

public class ReturnBookCommond implements MyCommand {
    private final BookRepository bookRepository;

    public ReturnBookCommond(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public String run(String command, Router router) {
        return new ReturnBook(bookRepository).returnBook(command);
    }

    @Override
    public String getDescription() {
        return "Try to return book by enter 'rt bookid'";
    }
}
