
package com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialCalculatorTest {

    private FactorialCalculator calc;
    @Before
    public void setUp() {
        System.out.println("Setting up factorial calculator...");
        calc = new FactorialCalculator();
    }
    @After
    public void tearDown() {
        System.out.println("Cleaning up...");
        calc = null;
    }

    @Test
    public void testFactorialOfZero() {
        // Arrange
        int input = 0;

        // Act
        int result = calc.factorial(input);

        // Assert
        assertEquals(1, result);
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        // Arrange
        int input = 5;

        // Act
        int result = calc.factorial(input);

        // Assert
        assertEquals(120, result); // 5! = 120
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        // Arrange
        int input = -3;

        // Act
        calc.factorial(input); // Should throw exception

        // Assert — handled by expected = ...
    }
}
