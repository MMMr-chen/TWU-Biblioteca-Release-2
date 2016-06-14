package com.twu.biblioteca.core;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.view.Printer;

import java.util.Map;

public class ListBooks {

    public ListBooks(){
    }
    private Map<String, Book> getList(){
        return new BookRepository().getBookList();
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
