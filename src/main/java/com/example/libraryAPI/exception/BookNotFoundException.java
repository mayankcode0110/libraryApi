package com.example.libraryAPI.exception;

public class BookNotFoundException extends RuntimeException{
    public BookNotFoundException(Long id){
        super("Book Not Found with ID: "+id);
    }
}
