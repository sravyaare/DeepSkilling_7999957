package com.library.springcoremaven.exercise6.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    public String getBookName() {
        return "Head First Java";
    }
}