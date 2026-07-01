package org.example.slf4jloggingexercises.exercise2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {

        String username = "Sravya";
        int marks = 95;

        logger.info("Student Name: {}", username);

        logger.info("Marks Obtained: {}", marks);

        logger.info("Student {} secured {} marks.", username, marks);

    }
}