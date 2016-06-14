package com.twu.biblioteca.core;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.repository.BookRepository;

import java.util.Map;

public class ListBooks {

    private BookRepository bookRepository;

    public ListBooks(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    private Map<String, Book> getList(){
        return bookRepository.getBookList();
    }
    public String getString(){
        String result = "Book List:\n";
        for (Book book:getList().values()) {
            if (!book.isChecked()) {
                result += book.getId() + " : " +
                        book.getTitle() + ',' +
                        book.getAuthor() + ',' +
                        book.getAuthor() + ',' +
                        book.getYearPublished() +
                        '\n';
            }
        }
        return result;
    }
}
