package task3;

import utils.Utils;

public class Task3 {
    int[] array;
    public Task3(){
        Utils utils = new Utils();
        this.array = utils.initializeArray(4,10,99);
    }

    public boolean task3(){
        Utils utils = new Utils();
        utils.printArray(array);
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] >= array[i + 1]){
                return false;
            }
        }
        return true;
    }

}