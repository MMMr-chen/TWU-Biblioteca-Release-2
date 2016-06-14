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
        assertThat(listBooks.getString(),equalTo("Book List:\n"+
                "1 : <<Fellowship of the Ring>>,Yaxuan Evans,Yaxuan Evans,2001\n"+
                "2 : <<Tom Sawyer>>,Judy Li,Judy Li,2015\n"+
                "3 : <<Domain Driven Design>>,Eric Evans,Eric Evans,2003\n"));
    }

}