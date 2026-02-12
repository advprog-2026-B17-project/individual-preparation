package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArithmeticUtilityTest {

    private ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

    @Test
    void testDivideSuccess() {
        assertEquals(5.0, arithmeticUtility.divide(10.0, 2.0));
        assertEquals(-2.5, arithmeticUtility.divide(5.0, -2.0));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            arithmeticUtility.divide(10.0, 0.0);
        });

        assertEquals("Pembagi tidak boleh nol!", exception.getMessage());
    }

}
