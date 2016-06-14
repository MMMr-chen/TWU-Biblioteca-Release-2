package com.twu.biblioteca.core;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.repository.BookRepository;

import java.util.Map;

public class ReturnBook {

    private Map<String, Book> bookList;
    private BookRepository bookRepository;
    public ReturnBook(BookRepository bookRepository){
        this.bookRepository = bookRepository;
        bookList = this.bookRepository.getBookList();
    }

    public String returnBook(String command) {
        if (bookList.containsKey(command)){
            bookList.get(command).setChecked(false);
        }else {
            return "That is not a valid book to return.";
        };
        return "Thank you for returning the book.";
    }
}
