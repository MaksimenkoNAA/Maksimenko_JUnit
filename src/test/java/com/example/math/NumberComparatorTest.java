package com.example.math;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberComparatorTest {
    @Test
    public void testFirstNumberGreater() {
        String result = NumberComparator.compare(10, 5);
        Assert.assertEquals(result, "Первое число больше второго");
    }

    @Test
    public void testFirstNumberLess() {
        String result = NumberComparator.compare(3, 8);
        Assert.assertEquals(result, "Первое число меньше второго");
    }

    @Test
    public void testNumbersEqual() {
        String result = NumberComparator.compare(7, 7);
        Assert.assertEquals(result, "Числа равны");
    }
}