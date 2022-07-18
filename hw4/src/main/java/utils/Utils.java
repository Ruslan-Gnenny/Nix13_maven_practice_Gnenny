package utils;

import java.util.Random;

final public class Utils {

    public int[] initializeArray(int size, int leftBoarder, int rightBoarder) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(rightBoarder - leftBoarder) + leftBoarder;
        }
        return array;
    }

    public void printArray(int[] array) {
        for (int element:array) {
            System.out.printf("%4d", element);
        }
        System.out.println();
    }

}