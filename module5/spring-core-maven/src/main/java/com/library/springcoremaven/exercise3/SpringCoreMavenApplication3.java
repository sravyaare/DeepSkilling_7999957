package com.library.springcoremaven.exercise3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.springcoremaven.exercise3.service.BookService;

public class SpringCoreMavenApplication3 {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("exercise3-context.xml");

        BookService service =
                context.getBean("bookService", BookService.class);

        service.displayBook();
    }
}