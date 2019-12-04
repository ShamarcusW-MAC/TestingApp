package com.example.testingapp;

public class AndroidCalculator implements Calculator {
    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public int subtract(int a, int b) {
        return a-b;
    }

    @Override
    public int multiply(int a, int b) {
        return a*b;
    }

    @Override
    public int divide(int a, int b) throws IllegalArgumentException {

        if (b == 0) {
            throw new IllegalArgumentException("Dividision by zero");
        }
        else {
            return a / b;
        }
    }
}
