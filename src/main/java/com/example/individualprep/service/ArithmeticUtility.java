package com.example.individualprep.service;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticUtility {
    
    public double add(double o1, double o2) {
        // TODO: Implement me properly!
        return 0.0;
    }

    public double subtract(double o1, double o2) {
        // TODO: Implement me properly!
        return 0.0;
    }

    public double multiply(double o1, double o2) {
        return o1 * o2;
    }

    public double divide(double o1, double o2) {
        if (o2 == 0) {
            throw new ArithmeticException("Pembagi tidak boleh nol!");
        }
        return o1 / o2;
    }

    public double exponent(double o1, int n) {
        if (o1 == 0 && n <= 0) {
            throw new ArithmeticException("Basis nol tidak boleh dipangkatkan dengan eksponen nol atau negatif!");
        }
        if (n == 0) {
            return 1.0;
        }
        double result = 1.0;
        for (int i = 1; i <= Math.abs(n); i++) {
            result *= o1;
        }
        return n < 0 ? 1.0 / result : result;
    }
}
