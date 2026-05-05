package com.example.math;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleAreaCalculatorTest {

    @Test
    public void testAreaWithPositiveValues() {
        double area = TriangleAreaCalculator.calculateArea(10, 5);
        Assert.assertEquals(area, 25.0, 0.001);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testAreaWithZeroBase() {
        TriangleAreaCalculator.calculateArea(0, 5);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testAreaWithNegativeHeight() {
        TriangleAreaCalculator.calculateArea(10, -5);
    }
}
