package task5;

import utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    int input;
    int[] array;
    public Task5(int input){
        Utils utils = new Utils();
        Scanner scanner = new Scanner(System.in);
        this.array = utils.initializeArray(input,0,input);
        this.input = input;
        if(input <= 3) {
            while(input <= 3) {
                System.out.print("Enter number bigger then 3: ");
                input = scanner.nextInt();
            }
        }
    }

    public void task5(){
        Utils utils = new Utils();
        utils.printArray(array);
        ArrayList<Integer> evenNumbers = getArrayOfEvenElements(array);
        int[] arrEven = new int[evenNumbers.size()];
        for(int i = 0; i < evenNumbers.size();i++)
        {
            arrEven[i] = evenNumbers.get(i);
        }
        utils.printArray(arrEven);
    }

    ArrayList<Integer> getArrayOfEvenElements(int[] array) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int j : array) {
            if (j % 2 == 0) {
                arrayList.add(j);
            }
        }
        return arrayList;
    }

}