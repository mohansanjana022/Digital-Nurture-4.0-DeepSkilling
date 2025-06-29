
package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
  
        assertEquals("Sum mismatch", 5, 2 + 3);        
        assertTrue("Expected condition to be true", 10 > 1);
        assertFalse("Expected condition to be false", 2 > 5);
        String nullString = null;
        assertNull("Should be null", nullString);
        String notNullString = "JUnit";
        assertNotNull("Should not be null", notNullString);
        String a = "test";
        String b = a;
        assertSame("Should refer to same object", a, b);
        String x = new String("Hello");
        String y = new String("Hello");
        assertNotSame("Should not refer to same object", x, y);
    }
}
