package Lab1.Q2;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> numArr = new ArrayList<>();
//        while(true){
//            int input = sc.nextInt();
//            if(input >= 1 && input <= 100){
//                numArr.add(input);
//            }
//            else if(input < 0){
//                System.out.println("System is shutting down...");
//                break;
//            }
//            else{
//                System.out.println("Number out of bounds!");
//                break;
//            }
//        }
//        System.out.println(countNums(numArr));
        frequencyOfNumbers(new int[]{1,2,3,4,5,5,1,1,11,1});
    }

    public static void frequencyOfNumbers(int[] array){
        //Create an array to store the frequency of each number
        int[] frequency = new int[array.length];

        for(int i = 0; i < array.length; i++) {
            //Set the frequency of the current number to 0
            frequency[i] = 0;

            //Loop through the array and check for matches
            for(int j = 0; j < array.length; j++) {
                //If a match is found, increment the frequency
                if(array[i] == array[j]) {
                    frequency[i]++;
                }
            }
        }

        //Print out the frequency of each number
        for(int i = 0; i < array.length; i++) {
            System.out.println("Number " + array[i] + " occurs " + frequency[i] + " times");
        }
    }
}
