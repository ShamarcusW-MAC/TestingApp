package com.example.testingapp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class MathPresenterTest {

    private MathPresenter presenter;

    //These are our mock candidates.
    @Mock
    private Calculator calculator;
    @Mock
    private MathContract.View view;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
//        calculator = new AndroidCalculator();
        presenter = new MathPresenter(view);
    }

    @Test
    public void sum() {
        //Verify that we interacted with the calculator
        when(calculator.sum(anyInt(), anyInt())).thenReturn(anyInt());
        //perform the operation
        presenter.sum(2, 2);
        //Verify that thte result is given to the view
        verify(view).showResult(anyInt());
    }

    @Test
    public void subtract() {
        //Verify that we interacted with the calculator
        when(calculator.subtract(anyInt(), anyInt())).thenReturn(anyInt());
        //perform the operation
        presenter.subtract(2, 2);
        //Verify that thte result is given to the view
        verify(view).showResult(anyInt());
    }

    @Test
    public void multiply() {
        //Verify that we interacted with the calculator
        when(calculator.multiply(anyInt(), anyInt())).thenReturn(anyInt());
        //perform the operation
        presenter.multiply(2, 2);
        //Verify that thte result is given to the view
        verify(view).showResult(anyInt());
    }

    @Test
    public void divide() {
        //Verify that we interacted with the calculator
        when(calculator.divide(anyInt(), anyInt())).thenReturn(anyInt());
        //perform the operation
        presenter.divide(2, 2);
        //Verify that thte result is given to the view
        verify(view).showResult(anyInt());
    }

    @Test
    public void divideShouldThrowException() {
        when(calculator.divide(anyInt(), anyInt())).thenThrow(new IllegalArgumentException());

        presenter.divide(2, 0);
        verify(view).showError(anyString());
    }
}