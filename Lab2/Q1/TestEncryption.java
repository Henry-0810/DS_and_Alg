package Lab2.Q1;

public class TestEncryption {
    public static void main(String[] args) {
        System.out.println(Encryption.encryptRowColumn("We have apples",5));
        System.out.println(Encryption.decryptRowColumn("WEEEASHPXAPXVLX",5));

        System.out.println(Encryption.encryptCaesarCipher("We have apples",4));
        System.out.println(Encryption.decryptCaesarCipher("[I LEZI ETTPIW",4));
    }
}
