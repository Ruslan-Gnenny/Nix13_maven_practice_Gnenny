package task2;

import utils.Utils;

public class Task2 {
    int[] array;
    public Task2(){
        Utils utils = new Utils();
        this.array = utils.initializeArray(8, 1,10);
    }

    public void task2(){
        Utils utils = new Utils();
        utils.printArray(array);
        int[] array2 = changeEvenIndexedElementToZero(array);
        utils.printArray(array2);
    }

    int[] changeEvenIndexedElementToZero(int[] array){
        for (int i = 0; i < array.length; i++) {
            if(i % 2 != 0){
                array[i] = 0;
            }
        }
        return array;
    }

}