package task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void isStringContainsSubstringIgnoredCaseTrue() {
        String inputStr = "Stephen Edwin King";
        String subStr = "stephen edwin king";
        boolean expected = true;
        boolean actual = Task4.isStringContainsSubstringIgnoredCase(inputStr, subStr);
        assertEquals(expected, actual, "String does not contains this substring!");
    }

    @Test
    void isStringContainsSubstringIgnoredCaseFalse() {
        String inputStr = "Stephen Edwin King";
        String subStr = "Walter Winchell";
        boolean expected = false;
        boolean actual = Task4.isStringContainsSubstringIgnoredCase(inputStr, subStr);
        assertEquals(expected, actual, "Probably, a string contains this substring!");
    }

}