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
                break;
            }
            else{
                System.out.println("Number out of bounds!");
            }
        }
        System.out.println(countAllNums(numArr));
    }

    private static String countAllNums(ArrayList<Integer> numArr) {
        int count = 0;
        String output = "";
        for (int num:numArr) {
            for (int i = 1; i <= 100; i++) {
                if(num == i){
                    count++;
                }
            }
            output +=  num + ": " + count + "\n";
        }
        return output;
    }
}
