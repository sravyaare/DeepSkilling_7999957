package com.library.springcoremaven.exercise5.service;

import com.library.springcoremaven.exercise5.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter Method for Dependency Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBookDetails() {
        System.out.println("Book Name: " + bookRepository.getBookName());
    }
}