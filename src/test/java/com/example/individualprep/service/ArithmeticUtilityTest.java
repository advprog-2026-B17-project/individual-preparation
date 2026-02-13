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

    @Test
    void testMultiplySuccess() {
        assertEquals(0, arithmeticUtility.multiply(2, 0));
        assertEquals(3, arithmeticUtility.multiply(1, 3));
        assertEquals(0, arithmeticUtility.multiply(0, 0));
        assertEquals(0, arithmeticUtility.multiply(0, 3));
        assertEquals(14, arithmeticUtility.multiply(2, 7));
    }

    @Test
    void testExponentSuccess() {
        assertEquals(1.0, arithmeticUtility.exponent(5.0, 0));
        assertEquals(8.0, arithmeticUtility.exponent(2.0, 3));
        assertEquals(0.25, arithmeticUtility.exponent(2.0, -2));
        assertEquals(1.0, arithmeticUtility.exponent(-3.0, 0));
        assertEquals(-27.0, arithmeticUtility.exponent(-3.0, 3));
    }

    @Test
    void testExponentZeroBaseNegativeExponent() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            arithmeticUtility.exponent(0.0, -1);
        });

        assertEquals("Basis nol tidak boleh dipangkatkan dengan eksponen nol atau negatif!", exception.getMessage());
    }
}
