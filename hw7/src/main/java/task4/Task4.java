package task4;

public class Task4 {

    public static boolean isStringContainsSubstringIgnoredCase(String inputStr, String subStr){
        inputStr = inputStr.toLowerCase();
        subStr = subStr.toLowerCase();
        int i = 0;
        int j = 0;
        int count = 0;
        while(i < inputStr.length() && j < subStr.length()){
            if(inputStr.charAt(i) == subStr.charAt(j)){
                count++;
                j++;
            }else {
                j = 0;
                count = 0;
            }
            i++;
        }
        return count == subStr.length();
    }

}