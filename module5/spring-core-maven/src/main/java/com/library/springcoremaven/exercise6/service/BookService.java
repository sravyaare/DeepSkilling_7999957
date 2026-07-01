package com.library.springcoremaven.exercise6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.springcoremaven.exercise6.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void displayBook() {
        System.out.println("Book Name: " + bookRepository.getBookName());
    }
}