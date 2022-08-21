package task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void isStringStartsBySubstringTrue() {
        String inputStr = "Red is favorite color.";
        String subStr = "Red";
        boolean expected = true;
        boolean actual = Task5.isStringStartsBySubstring(inputStr, subStr);
        assertEquals(expected, actual, "String actually start with this substring!");
    }

    @Test
    void isStringStartsBySubstringFalse() {
        String inputStr = "Red is favorite color.";
        String subStr = "Red  ";
        boolean expected = false;
        boolean actual = Task5.isStringStartsBySubstring(inputStr, subStr);
        assertEquals(expected, actual, "String does not start with this substring!");
    }
}