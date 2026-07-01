package org.example.slf4jloggingexercises.exercise3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderLoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(AppenderLoggingExample.class);

    public static void main(String[] args) {

        logger.trace("Trace Message");

        logger.debug("Debug Message");

        logger.info("Information Message");

        logger.warn("Warning Message");

        logger.error("Error Message");

    }
}