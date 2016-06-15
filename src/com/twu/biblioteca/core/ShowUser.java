package com.twu.biblioteca.core;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.User;

public class ShowUser {
    public ShowUser() {
    }

    public String show(User currentUser) {
        String result = "Book List:\n";
        result += String.format("%-20s%-30s%-20s%\n", "Name", "Email", "Phone");
        result += "**********************************************************\n";
        result += String.format("%-10s%-30s%-15s%-20s\n",
                currentUser.getName(),
                currentUser.getEmail(),
                currentUser.getPhone());
        return result;

    }
}
