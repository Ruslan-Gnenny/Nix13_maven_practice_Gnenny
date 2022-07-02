package ua.nix.gnenny.hw1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void task1() {
        //arrange act assert
        String input = "wwf336wd";
                int expected = 12;
        //act
        int actual = SumOfNumbers.GetSumOfNumbers(input);
        //Assert
        assertEquals (expected, actual, "Method Task1 error");

    }

    @Test
    void task2() {
        //arrange act assert
        String input = "wwf336wd";
        String expected = "d - 1\nf - 1\nw - 3\n";
        //act
        String actual = SumOfSymbol.GetSumOfSymbol(input);
        //Assert
        assertEquals(expected, actual, "Method Task2 error");
    }


    @Test
    void task3() {
        //arrange act assert
        int input = 3;
        int[] expected = {11, 35};
        //act
        int[] actual = LessonEnds.GetLessonEnds(input);
        //Assert
        assertArrayEquals(expected,actual, "Method Task3 error");
    }
}