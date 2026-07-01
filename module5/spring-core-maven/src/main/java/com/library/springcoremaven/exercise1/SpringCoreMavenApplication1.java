package com.library.springcoremaven.exercise1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.springcoremaven.exercise1.repository.BookRepository;
import com.library.springcoremaven.exercise1.service.BookService;

public class SpringCoreMavenApplication1 {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("exercise1-context.xml");

        BookService service =
                context.getBean("bookService", BookService.class);

        BookRepository repository =
                context.getBean("bookRepository", BookRepository.class);

        service.displayServiceInfo();
        repository.getBookDetails();

        System.out.println("Exercise 1 executed successfully.");
    }
}