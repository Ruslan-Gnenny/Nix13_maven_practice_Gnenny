package task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void isStringContainsSubstringTrue() {
        String inputStr = "Stephen Edwin King";
        String subStr = "Edwin";
        boolean expected = true;
        boolean actual = Task3.isStringContainsSubstring(inputStr, subStr);
        assertEquals(expected, actual, "This substring must be contained in the string");
    }

    @Test
    void isStringContainsSubstringFalse() {
        String inputStr = "Stephen Edwin King";
        String subStr = "edwin";
        boolean expected = false;
        boolean actual = Task3.isStringContainsSubstring(inputStr, subStr);
        assertEquals(expected, actual, "This substring does not contained in the string!");
    }

}