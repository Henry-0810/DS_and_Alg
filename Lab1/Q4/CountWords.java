package Lab1.Q4;

public class CountWords {
    public static int countWords(String str){
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isWhitespace(str.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
