package com.cognizant.greet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for greet operations.
 */
@RestController
public class GreetController {

    /**
     * Endpoint /greet returning "Hello World"
     *
     * @return Greeting message
     */
    @GetMapping("/greet")
    public String greet() {
        return "Hello World";
    }
}
