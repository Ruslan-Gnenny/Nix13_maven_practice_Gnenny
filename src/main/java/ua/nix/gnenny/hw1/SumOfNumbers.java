package ua.nix.gnenny.hw1;

public class SumOfNumbers {
    public static int GetSumOfNumbers(String input) {
        String num = "";
        char[] c_arr = input.toCharArray();

        for (char c : c_arr) {
            if (Character.isDigit(c)) {
                num = num + c;
            }
        }

        int i = Integer.parseInt(num);
        int sum = 0;
        while (i != 0) {
            //Суммирование цифр числа
            sum += (i % 10);
            i /= 10;
        }

        return sum;
    }
}
