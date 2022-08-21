package task2;


public class Task2 {

    public static boolean isStringEndsBySubstring(String inputStr, String endStr){
        int j = 0;
        int i = inputStr.length() - endStr.length();
        while(j < endStr.length() - 1){
            if(inputStr.charAt(i) != endStr.charAt(j)){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }

}