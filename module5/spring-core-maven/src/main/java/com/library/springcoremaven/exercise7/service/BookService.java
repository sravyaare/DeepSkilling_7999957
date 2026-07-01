package com.library.springcoremaven.exercise7.service;

import com.library.springcoremaven.exercise7.repository.BookRepository;

public class BookService {

    private BookRepository constructorRepository;
    private BookRepository setterRepository;

    // Constructor Injection
    public BookService(BookRepository constructorRepository) {
        this.constructorRepository = constructorRepository;
    }

    // Setter Injection
    public void setSetterRepository(BookRepository setterRepository) {
        this.setterRepository = setterRepository;
    }

    public void displayBooks() {

        System.out.println("Constructor Injection Book : "
                + constructorRepository.getBookDetails());

        System.out.println("Setter Injection Book : "
                + setterRepository.getBookDetails());
    }
}