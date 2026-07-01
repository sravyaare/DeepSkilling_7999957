package org.example.exercise2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MathOperationsTest {

    @Test
    public void testAdd() {
        MathOperations math = new MathOperations();
        assertEquals(10, math.add(5, 5));
    }

    @Test
    public void testSubtract() {
        MathOperations math = new MathOperations();
        assertEquals(5, math.subtract(10, 5));
    }

    @Test
    public void testMultiply() {
        MathOperations math = new MathOperations();
        assertEquals(20, math.multiply(4, 5));
    }
}