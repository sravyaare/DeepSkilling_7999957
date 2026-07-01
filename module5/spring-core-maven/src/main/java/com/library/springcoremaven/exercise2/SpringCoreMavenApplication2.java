package com.library.springcoremaven.exercise2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.springcoremaven.exercise2.service.BookService;

public class SpringCoreMavenApplication2 {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("exercise2-context.xml");

        BookService service =
                context.getBean("bookService", BookService.class);

        service.displayBook();

        System.out.println("Dependency Injection Successful.");
    }
}