package com.library.springcoremaven.exercise3.repository;

public class BookRepository {

    public String getBookDetails() {

        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Effective Java";
    }
}