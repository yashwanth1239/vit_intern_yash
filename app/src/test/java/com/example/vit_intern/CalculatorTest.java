package com.example.vit_intern;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
    Calculator calculator;
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator();

    }

    public void testAdd() {
        int expected = 30;
        int actual = calculator.add(10,20);
        assertEquals(expected,actual);
    }

    public void testMul() {
        int exp = 20;
        int act = calculator.mul(5,4);

        assertEquals(exp,act);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();

    }
}