package task5;

public class Task5 {

    public static boolean isStringStartsBySubstring(String inputStr, String subStr){
        int j = 0;
        int i = 0;
        while(j < subStr.length() && i < subStr.length()){
            if(inputStr.charAt(i) != subStr.charAt(j)){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }

}