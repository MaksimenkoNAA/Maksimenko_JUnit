package com.example.math;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArithmeticCalculatorTest {
    @Test
    public void testAddition() {
        Assert.assertEquals(ArithmeticCalculator.add(5, 3), 8);
    }

    @Test
    public void testSubtraction() {
        Assert.assertEquals(ArithmeticCalculator.subtract(10, 4), 6);
    }

    @Test
    public void testMultiplication() {
        Assert.assertEquals(ArithmeticCalculator.multiply(6, 7), 42);
    }

    @Test
    public void testDivision() {
        Assert.assertEquals(ArithmeticCalculator.divide(15, 3), 5.0, 0.001);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivisionByZero() {
        ArithmeticCalculator.divide(10, 0);
    }
}