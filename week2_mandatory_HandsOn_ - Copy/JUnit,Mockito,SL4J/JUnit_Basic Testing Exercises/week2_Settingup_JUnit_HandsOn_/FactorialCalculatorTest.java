
package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FactorialCalculatorTest {

    @Test
    public void testFactorialOfZero() {
        FactorialCalculator calc = new FactorialCalculator();
        assertEquals(1, calc.factorial(0));  // 0! = 1
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        FactorialCalculator calc = new FactorialCalculator();
        assertEquals(120, calc.factorial(5));  // 5! = 120
        assertEquals(6, calc.factorial(3));    // 3! = 6
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        FactorialCalculator calc = new FactorialCalculator();
        calc.factorial(-4);  // Should throw exception
    }
}

