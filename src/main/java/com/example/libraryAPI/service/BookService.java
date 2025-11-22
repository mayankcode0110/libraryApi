package com.example.libraryAPI.service;

import com.example.libraryAPI.model.Book;

import java.util.List;

public interface BookService {
    Book addBook(Book book);
    Book getBookByID(Long id);
    Book updateBook(Long id, Book book);
    List<Book> getAllBooks();
    void deleteBook(Long id);
}
