package ua.nix.gnenny.hw1;

public class LessonEnds {
    public static int[] GetLessonEnds(int num){
        int hours = 9;
        int minutes = 0;
        for (int i = 1; i <= num; i++) {
            minutes = minutes + 45;
            if (minutes - 60 >= 0) {
                minutes = minutes - 60;
                hours++;
            }
            if (dividesByTwo(i) && num != i) {
                minutes = minutes + 15;
                if (minutes - 60 >= 0) {
                    minutes = minutes - 60;
                    hours++;
                }
            }
            if (!dividesByTwo(i) && num != i) {
                minutes = minutes + 5;
                if (minutes - 60 >= 0) {
                    minutes = minutes - 60;
                    hours++;
                }

            }

        }

            int number1 = hours;
            int number2 = minutes;
            return new int[] {number1, number2};

    }

    static boolean dividesByTwo(int a) {
        return (a % 2 == 0);
    }
}

