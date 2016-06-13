package com.twu.biblioteca.view;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class PrinterTest {
    private ByteArrayOutputStream output = new ByteArrayOutputStream();
    private Printer printer;
    @Before
    public void setUp(){
        System.setOut(new PrintStream(output));
        printer = new Printer();
    }
    @Test
    public void should_print_correct_string(){
        printer.print("Hello World!");
        assertThat(output.toString(),is("Hello World!\n"));
    }

}