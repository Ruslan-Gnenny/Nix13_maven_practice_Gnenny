package task1;

public class Task1 {

    public static String getStringOfSymbols( String source, String symbols ) {
        String result = "";
        for(int i = 0; i < source.length(); i++){
            boolean isThere = false;
            for(int j = 0; j < symbols.length() && !isThere; j++){
                if(source.charAt(i) == symbols.charAt(j)){
                    result = result.concat(String.valueOf(source.charAt(i)));
                    isThere = true;
                }
            }
        }
        return  result;
    }

}