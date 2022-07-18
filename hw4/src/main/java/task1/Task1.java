package task1;
import utils.Utils;

public class Task1 {
    int[] array;
    int max;
    public Task1(){
        Utils utils = new Utils();
        this.array = utils.initializeArray(12, -15,15);
        this.max = getMaxIndexOfArray(array);
    }

    public void task1(){
        Utils utils = new Utils();
        utils.printArray(array);
        System.out.printf("%d\t", max);
        System.out.printf("[%d]", getLastIndexOfValueInArray(array, max));
    }

    int getMaxIndexOfArray(int[] array) {
        int max = array[0];
        for (var element : array) {
            if (max < element) {
                max = element;
            }
        }
        return max;
    }

    int getLastIndexOfValueInArray(int[] array, int value) {
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] == value) {
                return i;
            }
        }
        return -array.length;
    }

}