package com.twu.biblioteca.core;

import com.twu.biblioteca.repository.BookRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ListBooksTest {
    @Mock
    private ListBooks listBooks;
    private BookRepository bookRepository;

    @Before
    public void setUp(){
        bookRepository =new BookRepository();
        listBooks = new ListBooks(bookRepository);
    }
    @Test
    public void should_print_list(){
        assertThat(listBooks.getString(),equalTo("Book List:\n" +
                "Id        Titile                        Author         YearPublished       \n" +
                "**********************************************************************\n" +
                "1         <<Fellowship of the Ring>>    Yaxuan Evans   2001                \n" +
                "2         <<Tom Sawyer>>                Judy Li        2015                \n" +
                "3         <<Domain Driven Design>>      Eric Evans     2003                \n"));
    }

}