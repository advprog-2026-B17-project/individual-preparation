package com.example.individualprep.service;

import org.springframework.stereotype.Service;

@Service
public class VectorUtility {
    
    public double[] add(double[] v1, double[] v2) {
        if (v1 == null || v2 == null) {
            if (v1 == null && v2 != null)
                throw new IllegalArgumentException("Vektor pertama tidak boleh null!");
            if (v1 != null && v2 == null)
                throw new IllegalArgumentException("Vektor kedua tidak boleh null!");
            throw new IllegalArgumentException("Kedua vektor tidak boleh null!");
        }
        if (v1.length != v2.length) {
            throw new IllegalArgumentException("Dimensi kedua vektor harus sama!");
        }
        double[] result = new double[v1.length];
        for (int index = 0; index < v1.length; index++) {
            result[index] = v1[index] + v2[index];
        }
        return result;
    }

    public double[] subtract(double[] v1, double[] v2) {
        if (v1 == null || v2 == null) {
            throw new IllegalArgumentException("Vektor tidak boleh null!");
        }
        if (v1.length != v2.length) {
            throw new IllegalArgumentException("Dimensi vektor harus sama!");
        }
        double[] result = new double[v1.length];
        for (int index = 0; index < v1.length; index++) {
            result[index] = v1[index] - v2[index];
        }
        return result;
    }

    public double[] multiply(double[] v1, int x) {
        if (v1 == null) {
            throw new IllegalArgumentException("Vektor tidak boleh null!");
        }
        double[] result = new double[v1.length];
        for (int index = 0; index < v1.length; index++) {
            result[index] = v1[index] * x;
        }
        return result;
    }
    
    public double dotProduct(double[] v1, double[] v2) {
        // TODO: Implement me properly!
        return 0.0;
    }
    
    public double norm(double[] v1) {
        // TODO: Implement me properly!
        return 0.0;
    }
}