package task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveMultiplicationTest {

    @Test
    void multiplicationOneOfNumbersIsZero() {
        int n = 2;
        int m = 0;
        int expected = 0;
        int actual = RecursiveMultiplication.multiplication(n, m);
        assertEquals(expected, actual, "multiplication by 0 should return 0!");
    }

    @Test
    void multiplicationFirstOfNumbersIsOne() {
        int n = 1;
        int m = 2;
        int expected = 2;
        int actual = RecursiveMultiplication.multiplication(n, m);
        assertEquals(expected, actual, "multiplication by 1 should give the value of the second multiplier!");
    }

    @Test
    void multiplicationSecondOfNumbersIsOne() {
        int n = 2;
        int m = 1;
        int expected = 2;
        int actual = RecursiveMultiplication.multiplication(n, m);
        assertEquals(expected, actual, "multiplication by 1 should give the value of the first multiplier!");
    }

    @Test
    void multiplicationTest() {
        int n = 2;
        int m = 7;
        int expected = 14;
        int actual = RecursiveMultiplication.multiplication(n, m);
        assertEquals(expected, actual, "product of numbers is not correct");
    }

    @Test
    void productOfNumbers() {
        int n = -2;
        int m = 8;
        int expected = -16;
        int actual = RecursiveMultiplication.productOfNumbers(n, m);
        assertEquals(expected, actual);
    }
}