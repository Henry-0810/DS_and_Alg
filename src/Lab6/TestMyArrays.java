package Lab6;

import java.util.Arrays;

public class TestMyArrays {
    public static void main(String[] args) {
        int[] arr = {1,55,78,43,33,67,99};
        MyArrays.insertionSort(arr);
        arr = new int[]{1, 55, 78, 43, 33, 67, 99};
        MyArrays.selectionSort(arr);
        arr = new int[]{1, 55, 78, 43, 33, 67, 99};
        Arrays.sort(arr);
    }
}
