package com.challenge.library.model;

import java.util.HashSet;

public class User {
    // Attributes
    private String username;
    private String password;
    private String name;
    private String email;
    private HashSet<Book> books;

    // Constructor with parameters
    public User(String username, String password, String name, String email, HashSet<Book> books) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.books = books;
    }

    // Get and set methods
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public HashSet<Book> getBooks() {
        return books;
    }

    public void setBooks(HashSet<Book> books) {
        this.books = books;
    }
}
