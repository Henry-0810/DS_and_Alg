package Lab2;

public class Encryption {

    public static String encryptRowColumn(String plaintext, int numColumns) {
        plaintext = plaintext.replaceAll(" ","").toUpperCase();
        int numRows = (int) Math.ceil((float)plaintext.length()/numColumns);
        if(plaintext.length() < numRows*numColumns){
            plaintext = plaintext + "X".repeat(Math.max(0, (numRows * numColumns) - plaintext.length() + 1));
        }
        StringBuilder cipherTxt = new StringBuilder();
        for (int col = 0; col < numColumns; col++) {
            int idx = col;
            for (int row = 0; row < numRows; row++) {
                cipherTxt.append(plaintext.toCharArray()[idx]);
                idx += numColumns;
            }
        }
        return cipherTxt.toString();
    }

    public static String decryptRowColumn(String cipherText, int numColumns){
        int val = (int) Math.ceil((float)cipherText.length()/numColumns);
        return encryptRowColumn(cipherText,val);
    }

    public static String encryptCaesarCipher(String plaintext, int shift){
        plaintext = plaintext.toUpperCase();
        if(shift >= 26){
            System.out.println("Only 26 letters, therefore please choose numbers from 0 to 25");
        }
        StringBuilder cipherTxt = new StringBuilder();
        for (int i = 0; i < plaintext.length();i++) {
            if(!Character.isWhitespace(plaintext.charAt(i))){
                char ch = plaintext.charAt(i);
                ch+=shift;
                cipherTxt.append(ch);
            }
            else{
                cipherTxt.append(" ");
            }
        }
        return cipherTxt.toString();
    }

    public static String decryptCaesarCipher(String plaintext, int shift){
        return encryptCaesarCipher(plaintext,-shift);
    }
}
