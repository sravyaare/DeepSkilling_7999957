package com.example.exercise9.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {

    private CalculatorService calculatorService;

    @BeforeEach
    void setup() {
        calculatorService = new CalculatorService();
    }

    @ParameterizedTest
    @CsvSource({
            "1,1",
            "2,4",
            "3,9",
            "4,16",
            "5,25",
            "6,36",
            "7,49",
            "8,64",
            "9,81",
            "10,100"
    })
    void testSquare(int input, int expected) {

        assertEquals(expected, calculatorService.square(input));

    }

}