package com.twu.biblioteca.core;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.repository.BookRepository;

import java.util.Map;

public class CheckOutBook {

    private BookRepository bookRepository;
    private Map<String, Book> bookList;
    public CheckOutBook(BookRepository bookRepository){
        this.bookRepository = bookRepository;
        bookList = this.bookRepository.getBookList();
    }

    public String checkOut(String command) {
        if (isValid(command)){
          bookList.get(command).setChecked(true);
        }else {
            return "That book is not available.";
        };
        return "Thank you! Enjoy the book";
    }

    private boolean isValid(String command) {
        return bookList.containsKey(command)&&!bookList.get(command).isChecked();
    }
}
