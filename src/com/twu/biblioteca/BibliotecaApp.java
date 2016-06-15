package com.twu.biblioteca;

import com.twu.biblioteca.controller.LibraryController;
import com.twu.biblioteca.controller.LoginController;
import com.twu.biblioteca.controller.Router;
import com.twu.biblioteca.entity.User;
import com.twu.biblioteca.repository.BookRepository;
import com.twu.biblioteca.repository.MovieRepository;
import com.twu.biblioteca.repository.OriginRouter;
import com.twu.biblioteca.repository.UserRepository;
import com.twu.biblioteca.view.Printer;

import java.util.Scanner;

public class BibliotecaApp {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Printer printer = new Printer();
        BookRepository bookRepository =new BookRepository();
        MovieRepository movieRepository =new MovieRepository();
        UserRepository userRepository =new UserRepository();

        LoginController loginController =new LoginController(userRepository,printer,scanner);
        User currentUser=loginController.login();
        OriginRouter originRouter = new OriginRouter(bookRepository,movieRepository,currentUser);
        Router router = new Router(originRouter.getOriginRouter());
        LibraryController libraryController = new LibraryController(printer,scanner,router);
        libraryController.start();
    }
}
