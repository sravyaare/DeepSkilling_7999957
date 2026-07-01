package com.library.springcoremaven.exercise3.service;

import com.library.springcoremaven.exercise3.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook() {

        String book = bookRepository.getBookDetails();

        System.out.println("Book Name: " + book);
    }
}