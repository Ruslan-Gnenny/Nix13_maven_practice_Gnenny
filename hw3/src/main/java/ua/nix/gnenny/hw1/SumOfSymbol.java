package ua.nix.gnenny.hw1;

import java.util.HashMap;
import java.util.Map;

public class SumOfSymbol {
    public static String GetSumOfSymbol(String input) {
        final int charCount = 20000;
        int [] charsInStr= new int[charCount];
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if(c >= 'A' && c <= 'z') {
                charsInStr[c - 'A']++;
            }
        }
        String result = new String();
        for( int i = 0; i < charCount; i++){
            if(charsInStr[i] != 0) {
                result += Character.toString((char)('A' + i)) + " - " + Integer.toString(charsInStr[i]) + '\n';
            }
        }
        return result;
    }
}
