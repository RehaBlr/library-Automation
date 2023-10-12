package com.challenge.library.interfaces;

import com.challenge.library.enums.Categories;
import com.challenge.library.model.Book;

public interface LibraryManagement {
    void addBook(Book book);
    void updateBook( Book book);
    void updateBook(int id, String title, String author, Categories category, double price);
    void deleteBook(Book book);
}
