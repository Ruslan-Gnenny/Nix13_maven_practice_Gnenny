package task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void getNumberSquaredTest() {
        int number = 2;
        int expected = 4;
        int actual = Task1.getNumberSquared(number, 2);
        assertEquals(expected, actual, "Numbers square is incorrect!");
    }

    @Test
    void getInversionStringTest() {
        String str = "123";
        String expected = "321";
        String actual = Task1.getInversionString(str);
        assertEquals(expected, actual, "First and second string does`nt equals!");
    }

}