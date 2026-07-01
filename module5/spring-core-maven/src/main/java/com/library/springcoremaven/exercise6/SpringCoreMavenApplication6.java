package com.library.springcoremaven.exercise6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.springcoremaven.exercise6.service.BookService;

public class SpringCoreMavenApplication6 {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("exercise6-context.xml");

        BookService service =
                context.getBean(BookService.class);

        service.displayBook();

        System.out.println("Annotation Configuration Successful");
    }
}