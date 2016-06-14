package com.twu.biblioteca;

import com.twu.biblioteca.controller.LibraryController;
import com.twu.biblioteca.controller.Router;
import com.twu.biblioteca.model.*;
import com.twu.biblioteca.model.bookcommond.CheckOutCommond;
import com.twu.biblioteca.model.bookcommond.ListBookCommond;
import com.twu.biblioteca.model.bookcommond.ReturnCommond;
import com.twu.biblioteca.model.moviecommond.CheckOutMovieCommond;
import com.twu.biblioteca.model.moviecommond.ListMovieCommond;
import com.twu.biblioteca.model.moviecommond.ReturnMovie;
import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.view.Printer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BibliotecaApp {
    public static final Map<String,MyCommand> ORIGIN_ROUTER = new HashMap<String, MyCommand>(){
        {
            put("1",new ListBookCommond());
            put("2",new CheckOutCommond());
            put("3",new ReturnCommond());
            put("4",new ListMovieCommond());
            put("5",new CheckOutMovieCommond());
            put("5",new ReturnMovie());

        }
    };
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Printer printer = new Printer();
        BookRepository bookRepository =new BookRepository();
        Router router = new Router(ORIGIN_ROUTER);
        LibraryController libraryController = new LibraryController(printer,scanner,router);
        libraryController.start();
    }
}
