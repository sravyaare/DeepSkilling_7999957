package com.library.springcoremaven.exercise2.service;

import com.library.springcoremaven.exercise2.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook() {
        System.out.println("Book Name: " +
                bookRepository.getBookInfo());
    }
}