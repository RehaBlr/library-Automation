package com.challenge.library.model;

import java.util.ArrayList;

// Library class definition
public class Library {
    // Class attributes
//    private String name;
//    private String address;
//    private String phone;
    private ArrayList<Book> books;

    // Class constructor
    public Library( ArrayList<Book> books) {

        this.books = books;
    }

    // Class getters and setters

    public ArrayList<Book> getBooks() {
        return books;
    }
    // Kitap ekleme metodu
    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getName() + " isimli kitap kütüphaneye eklendi.");
    }
    // Method to update a book
    public void updateBook( Book oldBook, Book newBook) {
        int index = books.indexOf(oldBook);
        if(index != -1) {
            books.set(index, newBook);
            System.out.println("Kitap başarıyla güncellendi.");
        } else {
            System.out.println("Kitap bulunamadı.");
        }
    }

    // Kitap silme metodu
    public void deleteBook(Book book) {
        if (books.remove(book)) {
            System.out.println(book.getName() + " isimli kitap kütüphaneden silindi.");
        } else {
            System.out.println("Kitap bulunamadı.");
        }
    }
    //

    // Class toString method


    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}
