package task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void getMaxIndexOfArray() {
        Task1 task1 = new Task1();
        int[] array = {-2, 5, 0, 3, -12, 5, -2, 9, 14, 1, 0, -1};
        int expected = 14;
        int actual = task1.getMaxIndexOfArray(array);
        assertEquals(expected, actual, "This value is`nt bigger in array, or incorrect index of element");
    }

    @Test
    void getLastIndexOfValueInArray() {
        Task1 task1 = new Task1();
        int[] array = {-2, 5, 0, 3, -12, 5, -2, 9, 14, 1, 0, -1};
        int value = 14;
        int expected = 8;
        int actual = task1.getLastIndexOfValueInArray(array, value);
        assertEquals(expected, actual, "Incorrect index of element");
    }
}