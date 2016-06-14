package com.twu.biblioteca.core;

import com.twu.biblioteca.repository.MovieRepository;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ListMoviesTest {
    private MovieRepository movieRepositore;
    private ListMovies listMovies;

    @Before
    public void setUp(){
        movieRepositore = new MovieRepository();
        listMovies = new ListMovies(movieRepositore);
    }
    @Test
    public void should_return_correct_list(){
        assertThat(listMovies.getList(),is("Movies List:\n" +
                "Id        Name                          Year           Director            Rate           \n" +
                "*******************************************************************************\n" +
                "1         <<Fellowship of the Ring>>    2001           Yaxuan Evans        0              \n" +
                "2         <<Tom Sawyer>>                2015           Judy Li             10             \n" +
                "3         <<Domain Driven Design>>      2003           Eric Evans          8              \n"));
    }

}