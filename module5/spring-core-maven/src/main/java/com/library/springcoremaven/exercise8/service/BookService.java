package com.library.springcoremaven.exercise8.service;

import com.library.springcoremaven.exercise8.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBookDetails() {
        System.out.println("Book Name: " +
                bookRepository.getBookName());
    }
}