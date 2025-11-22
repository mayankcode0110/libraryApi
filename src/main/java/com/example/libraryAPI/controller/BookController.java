package com.example.libraryAPI.controller;

import com.example.libraryAPI.model.Book;
import com.example.libraryAPI.repository.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @PostMapping
    public Book addBook(@RequestBody Book book){
        System.out.println("Received Book: "+book);
        return bookRepository.save(book);
    }

    @GetMapping
    public List<Book> getALlBooks(){
        return bookRepository.findAll();
    }
}
