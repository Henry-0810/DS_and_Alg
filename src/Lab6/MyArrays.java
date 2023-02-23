package Lab6;

import java.util.Arrays;

public class MyArrays {
    public static void selectionSort(int[] arr){
        for (int i = 0; i <= arr.length - 2; i++) {
            //find index such that a[index] is the smallest of a[i]..a[a.length-1]
            int index = i;
            int smallest = arr[i];
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[j] < smallest) {
                    smallest = arr[j];
                    index = j;
                }
            }
            //if index != i, swap a[index] and a[i].
            if (index != i) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
    }

    public static void insertionSort(int[] arr){
        for (int i = 1; i <= arr.length-1; i++) {
            int val = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>val){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                j--;
            }
            arr[j+1] = val;
        }
    }

    public static int recursiveBinarySearch(int[] arr, int key,int from,int to) {
        if(from > to){
            //error
            return -1;
        }
        else{
            int m = (from+to)/2;
            if(key == arr[m]){
                return m;
            }
            else if(key>arr[m]){
                return recursiveBinarySearch(arr,key,m+1,to);
            }
            else return recursiveBinarySearch(arr,key,from,m-1);
        }
    }

}
