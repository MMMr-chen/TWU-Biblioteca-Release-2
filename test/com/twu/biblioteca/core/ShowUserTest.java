package com.twu.biblioteca.core;

import com.twu.biblioteca.entity.User;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ShowUserTest {
    private User user;
    private ShowUser showUser;
    @Before
    public void setUp(){
        user = new User("111","czh","111","123@123.com","18328282");
        showUser = new ShowUser();
    }
    @Test
    public void should_show_correct_information(){
        assertThat(showUser.show(user),is("User Information:\n" +
                "Name                Email                         Phone               \n" +
                "**********************************************************\n" +
                "czh                 123@123.com                   18328282            \n"));
    }

}