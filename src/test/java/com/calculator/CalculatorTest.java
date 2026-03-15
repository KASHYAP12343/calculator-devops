//Junit Testing
package com.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    CalculatorController calculator = new CalculatorController();

    // ---------------- ADD ----------------

    @Test
    void testAddPositiveNumbers() {
        assertEquals(8, calculator.add(5,3));
    }

    @Test
    void testAddNegativeNumbers() {
        assertEquals(-8, calculator.add(-5,-3));
    }

    @Test
    void testAddMixedNumbers() {
        assertEquals(2, calculator.add(5,-3));
    }

    @Test
    void testAddZero() {
        assertEquals(5, calculator.add(5,0));
    }

    // ---------------- SUBTRACT ----------------

    @Test
    void testSubtractPositive() {
        assertEquals(2, calculator.subtract(5,3));
    }

    @Test
    void testSubtractNegative() {
        assertEquals(-2, calculator.subtract(3,5));
    }

    @Test
    void testSubtractWithNegativeNumber() {
        assertEquals(8, calculator.subtract(5,-3));
    }

    @Test
    void testSubtractZero() {
        assertEquals(5, calculator.subtract(5,0));
    }

    // ---------------- MULTIPLY ----------------

    @Test
    void testMultiplyPositive() {
        assertEquals(20, calculator.multiply(4,5));
    }

    @Test
    void testMultiplyNegative() {
        assertEquals(-20, calculator.multiply(-4,5));
    }

    @Test
    void testMultiplyBothNegative() {
        assertEquals(20, calculator.multiply(-4,-5));
    }

    @Test
    void testMultiplyByZero() {
        assertEquals(0, calculator.multiply(5,0));
    }

    // ---------------- DIVIDE ----------------

    @Test
    void testDividePositive() {
        assertEquals(5, calculator.divide(10,2));
    }

    @Test
    void testDivideDecimal() {
        assertEquals(2.5, calculator.divide(5,2));
    }

    @Test
    void testDivideNegative() {
        assertEquals(-5, calculator.divide(-10,2));
    }

    @Test
    void testDivideZeroNumerator() {
        assertEquals(0, calculator.divide(0,5));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10,0));
    }

    // ---------------- SQRT ----------------

    @Test
    void testSqrtPerfectSquare() {
        assertEquals(5, calculator.sqrt(25));
    }

    @Test
    void testSqrtDecimal() {
        assertEquals(3, calculator.sqrt(9));
    }

    @Test
    void testSqrtZero() {
        assertEquals(0, calculator.sqrt(0));
    }

    // ---------------- POWER ----------------

    @Test
    void testPowerNormal() {
        assertEquals(8, calculator.power(2,3));
    }

    @Test
    void testPowerZeroExponent() {
        assertEquals(1, calculator.power(5,0));
    }

    @Test
    void testPowerOne() {
        assertEquals(5, calculator.power(5,1));
    }

    // ---------------- FACTORIAL ----------------

    @Test
    void testFactorialFive() {
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    void testFactorialZero() {
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    void testFactorialOne() {
        assertEquals(1, calculator.factorial(1));
    }

    // ---------------- LN ----------------

    @Test
    void testLnOne() {
        assertEquals(0, calculator.ln(1));
    }

    @Test
    void testLnE() {
        assertEquals(1, calculator.ln(Math.E));
    }

}
