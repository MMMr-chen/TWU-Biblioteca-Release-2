package com.twu.biblioteca.core;

import com.twu.biblioteca.repository.BookRepository;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ReturnBookTest {
    private BookRepository bookRepository;
    private ReturnBook returnBook;
    @Before
    public void setUp(){
        bookRepository =new BookRepository();
        returnBook = new ReturnBook(bookRepository);
    }
    @Test
    public void should_return_correct_when_book_is_avalible(){
        String commond = "1";
        String result = returnBook.returnBook(commond);
        assertThat(result,is("Thank you for returning the book."));
    }
    @Test
    public void should_return_wrongString_when_book_is_inavalible(){
        String commond = "4";
        String result = returnBook.returnBook(commond);
        assertThat(result,is("That is not a valid book to return."));
    }
    @Test
    public void right_book_should_be_returned(){
        String commond = "3";
        returnBook.returnBook(commond);
        boolean isChecked = bookRepository.getBookList().get(commond).isChecked();
        assertThat(isChecked,is(false));
    }

}