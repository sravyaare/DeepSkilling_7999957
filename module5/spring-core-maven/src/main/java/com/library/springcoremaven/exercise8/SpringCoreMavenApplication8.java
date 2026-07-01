package com.library.springcoremaven.exercise8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.springcoremaven.exercise8.service.BookService;

public class SpringCoreMavenApplication8 {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("exercise8-context.xml");

        BookService service =
                context.getBean("bookService", BookService.class);

        service.displayBookDetails();

        System.out.println("Spring AOP Executed Successfully");
    }
}