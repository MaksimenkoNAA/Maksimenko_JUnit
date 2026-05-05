package com.example;
import org.example.FactorialCalculator;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import com.example.FactorialCalculator; // строка импорта

public class FactorialCalculatorTest {
    private FactorialCalculator FactorialCalculator;

    @Test
    public void testFactorialZero() {
        assertEquals(FactorialCalculator.factorial(0), 1);
    }
}