package com.challenge.library.model;

import java.util.ArrayList;

// Library class definition
public class Library {
    // Class attributes
    private String name;
    private String address;
    private String phone;
    private ArrayList<Book> books;

    // Class constructor
    public Library(String name, String address, String phone, ArrayList<Book> books) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.books = books;
    }

    // Class getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    // Kitap ekleme metodu
    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getName() + " isimli kitap kütüphaneye eklendi.");
    }

    // Kitap silme metodu
    public void delBook(Book book) {
        if (books.remove(book)) {
            System.out.println(book.getName() + " isimli kitap kütüphaneden silindi.");
        } else {
            System.out.println("Kitap bulunamadı.");
        }
    }

    // Class toString method

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", books=" + books +
                '}';
    }
}
