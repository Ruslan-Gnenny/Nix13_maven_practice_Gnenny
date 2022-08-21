package main;

import task1.Task1;
import task2.Task2;
import task3.Task3;
import task4.Task4;
import task5.Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String str = "Hello world!";
        String str2 = "world";
        System.out.println(str);
        System.out.println("first element of string is: " + str.charAt(0));
        System.out.println("Last element of string is: " + str.charAt(str.length() - 1));
        System.out.println(Task1.getStringOfSymbols(str, str2));
        int a;
        a = str2.charAt(str2.length() - 2);
        System.out.println("Penultimate element is: " + (char)a);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some string and substring to check if a string ends with a substring: ");
        String inputStr = scanner.nextLine();
        String subStr = scanner.nextLine();
        System.out.println(Task2.isStringEndsBySubstring(inputStr, subStr));
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter a string and a substring to check if it is contained in the string: ");
        String inputString = scanner2.nextLine();
        String subString = scanner2.nextLine();
        System.out.println(Task3.isStringContainsSubstring(inputString, subString));
        System.out.println("This string contains substring ignored case: " + Task4.isStringContainsSubstringIgnoredCase(inputString, subString));
        System.out.println("String start with this substring" + Task5.isStringStartsBySubstring(inputString, subString));

    }
}