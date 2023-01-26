package Lab2.Q1;

public class Encryption {
    public static void main(String[] args) {
        System.out.println(encryptRowColumn("We have apples",5));
    }

    public static String encryptRowColumn(String plaintext, int numColumns) {
        plaintext = plaintext.replaceAll(" ","").toUpperCase();
        int numRows = (int) Math.ceil((float)plaintext.length()/numColumns);
        if(plaintext.length() < numRows*numColumns){
            StringBuilder plaintextBuilder = new StringBuilder(plaintext);
            int numRows2 = plaintextBuilder.length();
            for (int i = 0; i <= (numRows*numColumns)- plaintext.length() ; i++) {
                plaintextBuilder.append("X");
            }
            plaintext = plaintextBuilder.toString();
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
        return null;
    }
}
