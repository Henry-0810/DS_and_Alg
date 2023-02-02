package Lab3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class test {
    public static void main(String[] args) {
        HashSet<Integer> shuffleOrder = new HashSet<>();
        while(shuffleOrder.size() <= 10){
            int num = (int) (Math.random() * 10);
            shuffleOrder.add(num);
        }

        // check element is present or not. if not loop will
        // break.
        for (Integer integer : shuffleOrder) {
            System.out.println(integer);
        }
    }
}
