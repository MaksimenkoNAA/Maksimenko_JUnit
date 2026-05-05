package com.example.math;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialCalculatorTest {

    @Test
    void testFactorial() {
        assertEquals(6, FactorialCalculator.factorial(3));
        assertEquals(120, FactorialCalculator.factorial(5));
    }
}
class TriangleAreaTest {
    @Test
    void testValidTriangle() {
        assertEquals(6.0, TriangleArea.calculateArea(3, 4, 5), 0.001);
    }
}
class CalculatorTest {
    @Test
    void testAddition() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(-1, Calculator.subtract(2, 3));
    }

    @Test
    void testDivision() {
        assertEquals(2.5, Calculator.divide(5, 2));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, Calculator.multiply(2, 3));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> Calculator.divide(5, 0));
    }
}
class NumberComparatorTest {
    @Test
    void testEqualNumbers() {
        assertEquals(0, NumberComparator.compare(5, 5));
    }

    @Test
    void testFirstGreater() {
        assertEquals(1, NumberComparator.compare(7, 5));
    }

    @Test
    void testSecondGreater() {
        assertEquals(-1, NumberComparator.compare(3, 5));
    }
}