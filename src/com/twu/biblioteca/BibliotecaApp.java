package com.twu.biblioteca;

import com.twu.biblioteca.controller.LibraryController;
import com.twu.biblioteca.controller.Router;
import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.repository.MovieRepository;
import com.twu.biblioteca.repository.OriginRouter;
import com.twu.biblioteca.view.Printer;

import java.util.Scanner;

public class BibliotecaApp {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Printer printer = new Printer();
        BookRepository bookRepository =new BookRepository();
        MovieRepository movieRepository =new MovieRepository();
        OriginRouter originRouter = new OriginRouter(bookRepository,movieRepository);
        Router router = new Router(originRouter.getOriginRouter());
        LibraryController libraryController = new LibraryController(printer,scanner,router);
        libraryController.start();
    }
}
