package task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void getAverageOfArray() {
        Task4 task4 = new Task4();
        int[] array = {4, 0, 1, 4, 3};
        float expected = 2.4f;
        float actual = task4.getAverageOfArray(array);
        assertEquals(expected, actual, "Wrong average of array");
    }

    @Test
    void getEqualsAveragesFirstIsBigger() {
        Task4 task4 = new Task4();
        float average1stArray = 2.6f, average2ndArray = 2.4f;
        String expected = "First arrays average is bigger";
        String actual = task4.getEqualsAverages(average1stArray, average2ndArray);
        assertEquals(expected, actual, "Test method getEqualsAverages failed(first array is`nt bigger)");
    }

    @Test
    void getEqualsAveragesSecondIsBigger() {
        Task4 task4 = new Task4();
        float average1stArray = 2.4f, average2ndArray = 2.6f;
        String expected = "Second arrays average is bigger";
        String actual = task4.getEqualsAverages(average1stArray, average2ndArray);
        assertEquals(expected, actual, "Test method getEqualsAverages failed(second array is`nt bigger)");
    }

    @Test
    void getEqualsAveragesEquals() {
        Task4 task4 = new Task4();
        float average1stArray = 2.4f, average2ndArray = 2.4f;
        String expected = "Averages is equals";
        String actual = task4.getEqualsAverages(average1stArray, average2ndArray);
        assertEquals(expected, actual, "Test method getEqualsAverages failed(averages of arrays is`nt equals)");
    }

}