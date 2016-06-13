package com.twu.biblioteca.model;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BookTest {
    private Book book;
    @Before
    public void setUp(){
        book = new Book("The Hobbit","Anand Beck","1984");
    }
    @Test
    public void should_create_correct_book(){
        assertThat(book.getTitle(),is("The Hobbit"));
        assertThat(book.getAuthor(),is("Anand Beck"));
        assertThat(book.getYearPublished(),is("1984"));
    }

}