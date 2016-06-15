package com.twu.biblioteca.entity;

public class User {
    private String accountName;
    private String name;
    private String password;
    private String email;
    private String phone;
    public User(String accountName, String name, String password, String email, String phone){
        this.accountName = accountName;
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }

    public User() {

    }

    public String getAccountName() {
        return accountName;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
