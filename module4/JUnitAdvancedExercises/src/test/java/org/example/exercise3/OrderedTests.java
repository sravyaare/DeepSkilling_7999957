package org.example.exercise3;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(1)
    void firstTest() {
        System.out.println("This is the first test");
    }

    @Test
    @Order(2)
    void secondTest() {
        System.out.println("This is the second test");
    }

    @Test
    @Order(3)
    void thirdTest() {
        System.out.println("This is the third test");
    }
}