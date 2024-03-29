package com.example.testingapp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AndroidCalculatorTest {

    private static final int SUM_EXPECTED = 4;
    private static final int SUB_EXPECTED = 4;
    private static final int MUL_EXPECTED = 4;
    private static final int DIV_EXPECTED = 2;


    private AndroidCalculator calculator;
    private int result;

    @Before
    public void setUp() throws Exception {
        calculator = new AndroidCalculator();
        result = 0;
    }

    @Test
    public void sum() {
        result = calculator.sum(2, 2);
        assertEquals(SUM_EXPECTED, result);
    }


    @Test
    public void subtract() {
        result = calculator.subtract(5, 1);
        assertEquals(SUB_EXPECTED, result);
    }

    @Test
    public void multiply() {
        result = calculator.sum(2, 2);
        assertEquals(MUL_EXPECTED, result);
    }

    @Test
    public void divide() {
        result = calculator.divide(8, 4);
        assertEquals(DIV_EXPECTED, result);
    }

//    @Test
    @Test(expected = IllegalArgumentException.class)
    public void divisionByZero(){
        result = calculator.divide(4, 0);

    }
}