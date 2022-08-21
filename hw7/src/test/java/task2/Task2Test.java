package task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void isStringEndsBySubstringForTrue() {
        String inputStr = "Python Exercises";
        String subString = "ses";
        boolean expected = true;
        boolean actual = Task2.isStringEndsBySubstring(inputStr, subString);
        assertEquals(expected, actual, "String ends by substring!");
    }

    @Test
    void isStringEndsBySubstringForFalse() {
        String inputStr = "Python Exercises";
        String subString = "se";
        boolean expected = false;
        boolean actual = Task2.isStringEndsBySubstring(inputStr, subString);
        assertEquals(expected, actual, "string does not end with a substring!");
    }
}