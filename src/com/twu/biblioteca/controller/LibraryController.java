package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.MyCommand;
import com.twu.biblioteca.view.Printer;

import java.util.Map;
import java.util.Scanner;

public class LibraryController {
    private Printer printer;
    private Scanner scanner;
    private Router router;
    private static final  String LIST_BOOKS = "List Books";
    public LibraryController(Printer printer, Scanner scanner, Router router){
        this.printer = printer;
        this.scanner = scanner;
        this.router = router;
    }
    public void operate(String input){

    }
    public void start(){
        printer.print("Welcome!");
        listMenu(router);
        do {
            String result;
            String commonds = scanner.nextLine();
            String[] commond = commonds.split(" ");
            if (commond.length>1) {
                result = router.getCommand(commond[0]).run(commond[1], router);
            }else {
                result = router.getCommand(commond[0]).run("", router);
            }
            printer.print(result);
            listMenu(router);
        }while (true);
    }

    private void listMenu(Router router) {
        Map<String,MyCommand> map = router.getMapper();
        printer.print("Options Menu:");
        for (String key:map.keySet()){
            printer.print(key+" : "+map.get(key).getDescription());
        }
    }
}
