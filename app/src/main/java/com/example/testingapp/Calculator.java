package com.example.testingapp;

public interface Calculator {

    int sum(int a, int b);
    int subtract(int a, int b);
    int multiply(int a, int b);
    int divide(int a, int b) throws IllegalArgumentException;

}
