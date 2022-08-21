package task1;

public class Task1 {

    public static int getNumberSquared(int number, int n){
        if(n == 0)
            return 1;
        return getNumberSquared(number, n - 1) * number;
    }

    public static String getInversionString(String string){
        String rightPart;
        String leftPart;
        int length = string.length();
        if(length <= 1){
            return string;
        }
        leftPart = string.substring(0, length / 2);
        rightPart = string.substring(length / 2, length);
        return getInversionString(rightPart) + getInversionString(leftPart);
    }

}