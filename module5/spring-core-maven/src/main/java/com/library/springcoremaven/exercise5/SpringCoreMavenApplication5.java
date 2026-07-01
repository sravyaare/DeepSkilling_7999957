package com.library.springcoremaven.exercise5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.springcoremaven.exercise5.service.BookService;

public class SpringCoreMavenApplication5 {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("exercise5-context.xml");

        BookService service =
                context.getBean("bookService", BookService.class);

        service.displayBookDetails();

        System.out.println("Spring IoC Container Configuration Successful");
    }
}