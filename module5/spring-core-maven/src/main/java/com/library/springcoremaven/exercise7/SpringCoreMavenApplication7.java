package com.library.springcoremaven.exercise7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.springcoremaven.exercise7.service.BookService;

public class SpringCoreMavenApplication7 {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("exercise7-context.xml");

        BookService service =
                context.getBean("bookService", BookService.class);

        service.displayBooks();

        System.out.println("Constructor and Setter Injection Successful");
    }
}