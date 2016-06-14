package com.twu.biblioteca.core;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.repository.BookRepository;

import java.util.Map;

public class CheckOutBook {

    private Map<String, Book> bookList;

    public String checkOut(String command) {
        bookList = BookRepository.getBookList();
        if (bookList.containsKey(command)&&!bookList.get(command).isChecked()){
          bookList.get(command).setChecked(true);
        }else {
            return "That book is not available.";
        };
        return "Thank you! Enjoy the book";
    }
}
