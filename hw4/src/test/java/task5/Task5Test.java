package task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @org.junit.jupiter.api.Test
    void getArrayOfEvenElements() {
        int a = 5;
        Task5 task5 =  new Task5(a);
        int[] array = {1, 4, 5, 3, 4, 7, 8, 3};
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(4, 4, 8));
        ArrayList<Integer> actual = task5.getArrayOfEvenElements(array);
        assertEquals(expected, actual, "Тot all even elements are eaten out");
    }

    @org.junit.jupiter.api.Test
    void getArrayOfEvenElementsNonEven() {
        int a = 5;
        Task5 task5 =  new Task5(a);
        int[] array = {1, 1, 5, 3, 9, 7, 3, 3};
        ArrayList<Integer> expected = new ArrayList<Integer>(List.of());
        ArrayList<Integer> actual = task5.getArrayOfEvenElements(array);
        assertEquals(expected, actual, "Array must be empty");
    }
}