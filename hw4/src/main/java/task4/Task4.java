package task4;

import utils.Utils;

public class Task4 {
    int[] array1;
    int[] array2;
    float average1;
    float average2;
    public Task4(){
        Utils utils = new Utils();
        this.array1 = utils.initializeArray(5,0,5);
        this.array2 = utils.initializeArray(5,0,5);
        this.average1 = getAverageOfArray(array1);
        this.average2 = getAverageOfArray(array2);
    }

    public void task4(){
        Utils utils = new Utils();
        utils.printArray(array1);
        utils.printArray(array2);
        System.out.println(getEqualsAverages(average1, average2));
    }

    float getAverageOfArray(int[] array){
        int average = 0;
        for (int j : array) {
            average += j;
        }
        return average/(float)array.length;
    }

    String getEqualsAverages(float average1stArray, float average2ndArray){
        String answer;
        if(average1stArray < average2ndArray){
            answer = "Second arrays average is bigger" ;
        }
        else if (average1stArray > average2ndArray){
            answer = "First arrays average is bigger";
        }
        else{
            answer = "Averages is equals";
        }
        return answer;
    }

}