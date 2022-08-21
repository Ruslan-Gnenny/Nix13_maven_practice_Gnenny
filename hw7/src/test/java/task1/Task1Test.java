package task1;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @org.junit.jupiter.api.Test
    void getStringOfSymbols() {
        String str = "Hello world!";
        String expected = "lloworld";
        String actual = Task1.getStringOfSymbols(str, "world");
        assertEquals(expected, actual, "Method getStringOfSymbols get redundant or missing characters!");
    }
}