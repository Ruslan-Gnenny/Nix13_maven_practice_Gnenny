package ua.nix.gnenny.hw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print ("Please, write num of task: ");
        int n = in.nextInt();

        switch (n) {
            case 1 -> Task1();
            case 2 -> Task2();
            case 3 -> Task3();
            default -> System.out.println("Impossible num of tusk!");
        }
    }

    public static void Task1() {


        Scanner in = new Scanner(System.in);
        System.out.print("Input a text: ");
        String input = in.nextLine();

        System.out.println("Sum of numbers is: " + SumOfNumbers.GetSumOfNumbers(input));

    }
    public static void Task2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a text: ");
        String input = in.nextLine();
        System.out.println ("Sum of symbols is: " + SumOfSymbol.GetSumOfSymbol(input));
    }
    public static void Task3(){

        Scanner in = new Scanner(System.in);
        System.out.print("Input num of lesson: ");
        int num = in.nextInt();
        if (num >=1  && num <= 10) {

            int[] result = LessonEnds.GetLessonEnds(num);
            System.out.print("Lesson ends in:" + result[0] + ":" + result[1]);
        }
        else System.out.print("Impossible num of lessons");
    }


}

