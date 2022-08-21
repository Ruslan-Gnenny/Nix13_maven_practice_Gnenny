package main;

import task1.Task1;
import task2_3.Box;
import task4.RecursiveMultiplication;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        System.out.println(Task1.getNumberSquared(number, 2));
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter string for inversion: ");
        String str = scanner1.nextLine();
        System.out.println(Task1.getInversionString(str));
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter star value for class Box");
        int value = scanner2.nextInt();
        Box box = new Box(value);
        System.out.println("Start value class Box is:" + box.getValue());
        Scanner scanner3 = new Scanner(System.in);
        int newValue = scanner3.nextInt();
        box.setValue(newValue);
        System.out.println("New value class Box is: " + box.getValue());
        Scanner scanner4 = new Scanner(System.in);
        System.out.print("Enter two numbers for get product: ");
        int n = scanner4.nextInt();
        int m = scanner4.nextInt();
        System.out.println(RecursiveMultiplication.productOfNumbers(-7, -3));
    }
}