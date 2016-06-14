package com.twu.biblioteca.core;

import com.twu.biblioteca.repository.BookRepository;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CheckOutBookTest {
    private BookRepository bookRepository;
    private CheckOutBook checkOutBook ;
    @Before
    public void setUp(){
        bookRepository =new BookRepository();
        checkOutBook = new CheckOutBook(bookRepository);
    }
    @Test
    public void should_return_correct_when_book_is_avalible(){
        String commond = "1";
        String result = checkOutBook.checkOut(commond);
        assertThat(result,is("Thank you! Enjoy the book"));
    }
    @Test
    public void should_return_wrongString_when_book_is_inavalible(){
        String commond = "4";
        String result = checkOutBook.checkOut(commond);
        assertThat(result,is("That book is not available."));
    }
    @Test
    public void right_book_should_be_checked(){
        String commond = "3";
        checkOutBook.checkOut(commond);
        boolean isChecked = bookRepository.getBookList().get(commond).isChecked();
        assertThat(isChecked,is(true));
    }
}