package Lab1.Q5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
    public static String inputNewPassword(){
        Scanner s = new Scanner(System.in);
        String password = s.nextLine();
        while(true){
            if(isValid(password)){
                return "Password entered is " + password;
            }
            else{
                System.out.println("Wrong pattern print again");
                password = s.nextLine();
            }
        }
    }

    private static boolean isValid(String password) {
        if(password == null || password.equals("")) return false;
        if(password.length() < 8) return false;
        if(password.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9]).{8,}$")) return true;
        else return false;
    }
}
