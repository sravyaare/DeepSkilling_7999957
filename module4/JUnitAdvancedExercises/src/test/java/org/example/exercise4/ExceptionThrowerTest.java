package org.example.exercise4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionThrowerTest {

    @Test
    void testExceptionThrown() {

        ExceptionThrower exceptionThrower = new ExceptionThrower();

        assertThrows(
                ArithmeticException.class,
                () -> exceptionThrower.throwException()
        );
    }
}