package com.library.springcoremaven.exercise9.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.springcoremaven.exercise9.entity.Book;

public interface BookRepository
        extends JpaRepository<Book, Long> {

}