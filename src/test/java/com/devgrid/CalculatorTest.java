package com.devgrid;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {


    private final Calculator calculator = new Calculator();

    @Test
    public void testMultiplybyZero() throws Exception {
        Integer product = calculator.multiply(0, 234234);
        assertEquals(new Integer(0), product);
    }

    @Test
    public void testMultiplyby1() throws Exception {
        Integer product = calculator.multiply(1, 234234);
        assertEquals(new Integer(234234), product);
    }

    @Test
    public void testMultiplyby2() throws Exception {
        Integer product = calculator.multiply(2, 3);
        assertEquals(new Integer(6), product);
    }

    @Test
    public void wrongTest() throws Exception {
        Integer product = calculator.multiply(3, 3);
        assertEquals(new Integer(6), product);
    }


}
