package com.twu.biblioteca.controller;

import com.twu.biblioteca.entity.User;
import com.twu.biblioteca.repository.UserRepository;
import com.twu.biblioteca.view.Printer;

import java.util.Map;
import java.util.Scanner;

public class LoginController {
    private Scanner scanner;
    private Printer printer;
    private Map<String, User> userMap;
    private UserRepository userRepository;

    public LoginController(UserRepository userRepository, Printer printer, Scanner scanner){
        this.userRepository = userRepository;
        this.printer = printer;
        this.scanner = scanner;
        userMap = userRepository.getUserMap();
    }
    public User login(){
        do {
            printer.print("Please input your account name:");
            String accountName = scanner.nextLine();
            printer.print("Please input your password:");
            String password = scanner.nextLine();
            if (isValid(accountName,password)){
                return userMap.get(accountName);
            }
            printer.print("inValid User");

        }while(true);
    }
    public boolean isValid(String accountName, String password){
        if (userMap.containsKey(accountName)&&userMap.get(accountName).getPassword().equals(password)){
            return true;
        }
        return false;
    }
}
