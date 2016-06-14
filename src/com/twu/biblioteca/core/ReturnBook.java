package com.twu.biblioteca.core;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.repository.BookRepository;

import java.util.Map;

public class ReturnBook {

    private Map<String, Book> bookList;

    public String returnBook(String command) {
        bookList = BookRepository.getBookList();
        if (bookList.containsKey(command)){
            BookRepository.getBookList().get(command).setChecked(false);
        }else {
            return "That is not a valid book to return.";
        };
        return "Thank you for returning the book.";
    }
}
