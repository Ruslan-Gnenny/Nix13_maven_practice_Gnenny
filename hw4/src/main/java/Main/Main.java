package Main;

import task1.Task1;
import task2.Task2;
import task3.Task3;
import task4.Task4;
import task5.Task5;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args){
            Task1 task1 = new Task1();
            task1.task1();
            Task2 task2 = new Task2();
            task2.task2();
            Task3 task3 = new Task3();
            System.out.println(task3.task3());
            Task4 task4 = new Task4();
            task4.task4();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number: ");
            int input = scanner.nextInt();
            Task5 task5 = new Task5(input);
            task5.task5();
        }
    }
