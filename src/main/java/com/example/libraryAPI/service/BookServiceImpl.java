package com.example.libraryAPI.service;

import com.example.libraryAPI.exception.BookNotFoundException;
import com.example.libraryAPI.model.Book;
import com.example.libraryAPI.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public Book addBook(Book book){
        return bookRepository.save(book);
    }

    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }

    public Book getBookByID(Long id){
        return bookRepository.findById(id).orElseThrow(()-> new BookNotFoundException(id));
    }

    public Book updateBook(Long id, Book updatedBook){
        return bookRepository.findById(id).map(existingBook -> {
            existingBook.setAuthor(updatedBook.getAuthor());
            existingBook.setTitle(updatedBook.getTitle());
            existingBook.setPrice(updatedBook.getPrice());
            return bookRepository.save(existingBook);
        }).orElseThrow(() -> new BookNotFoundException(id));
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

}
