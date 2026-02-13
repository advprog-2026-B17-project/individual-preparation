package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VectorUtilityTest {

    private final VectorUtility vectorUtility  = new VectorUtility ();

    @Test
    void testSubtractSuccess() {
        double[] v1 = {5.0, 10.0, 15.0};
        double[] v2 = {2.0, 3.0, 4.0};
        double[] expected = {3.0, 7.0, 11.0};

        assertArrayEquals(expected, vectorUtility.subtract(v1, v2));
    }

    @Test
    void testSubtractDifferentLength() {
        double[] v1 = {1.0, 2.0};
        double[] v2 = {1.0, 2.0, 3.0};

        assertThrows(IllegalArgumentException.class, () -> vectorUtility.subtract(v1, v2));
    }

    @Test
    void testMultiplySuccess() {
        double[] v1 = {1.0, 1.0, 1.0};
        int x = 2;
        double[] expected = {2.0, 2.0, 2.0};

        assertArrayEquals(expected, vectorUtility.multiply(v1, x));
    }

    @Test
    void testNullVector() {
        double[] v1 = null;
        int x = 0;

        assertThrows(IllegalArgumentException.class, () -> vectorUtility.multiply(v1, x));
    }

    @Test
    void testAddSuccess() {
        double[] v1 = {1.0, 2.0, 3.0};
        double[] v2 = {4.0, 5.0, 6.0};
        double[] expected = {5.0, 7.0, 9.0};

        assertArrayEquals(expected, vectorUtility.add(v1, v2));
    }

    @Test
    void testAddDifferentLength() {
        double[] v1 = {1.0, 2.0};
        double[] v2 = {1.0, 2.0, 3.0};

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            vectorUtility.add(v1, v2);
        });

        assertEquals("Dimensi kedua vektor harus sama!", exception.getMessage());
    }

    @Test
    void testAddNullVectors() {
        double[] v1 = null;
        double[] v2 = null;

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            vectorUtility.add(v1, v2);
        });

        assertEquals("Kedua vektor tidak boleh null!", exception.getMessage());
    }
}
