package Lab5;

import java.util.Arrays;

public class MyArrays {
    public static int sum(int[] values){
        if(values.length == 1) return values[0];
        return sum(Arrays.copyOfRange(values,0,values.length-1)) + values[values.length-1];
    }
}
