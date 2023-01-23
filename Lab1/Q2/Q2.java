package Lab1.Q2;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numArr = new ArrayList<>();
        while(true){
            int input = sc.nextInt();
            if(input >= 1 && input <= 100){
                numArr.add(input);
            }
            else if(input < 0){
                System.out.println("System is shutting down...");
                break;
            }
            else{
                System.out.println("Number out of bounds!");
                break;
            }
        }
        System.out.println(countNums(numArr));
    }

    private static String countNums(ArrayList<Integer> numArr) {
        int count = 0;
        String output = "";
        for (int num: numArr) {

        }
        return null;
    }
}
