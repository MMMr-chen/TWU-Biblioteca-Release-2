package com.twu.biblioteca.core;

import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.repository.BookRepository;

import java.util.Map;

public class ListBooks {

    private BookRepository bookRepository;

    public ListBooks(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    private Map<String, Book> getList(){
        return bookRepository.getBookMap();
    }
    public String getString(){
        String result = "Book List:\n";
        result += String.format("%-10s%-30s%-15s%-20s\n","Id","Titile","Author","YearPublished");
        result +="**********************************************************************\n";
        for (Book book:getList().values()) {
            if (!book.isChecked()) {
                result += String.format("%-10s%-30s%-15s%-20s\n",book.getId(),
                        book.getTitle(),
                        book.getAuthor(),
                        book.getYearPublished());
            }
        }
        return result;
    }
}
