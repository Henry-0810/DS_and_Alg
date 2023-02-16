package Lab5;

public class TestMyArrays {
    public static void main(String[] args) {
        int[] arr1 = {10};
        int[] arr2 = {1,2,3,4,5,6};
        int[] arr3 = {10,11,12,13,14,15};

        System.out.println("Expected: 10, Result: " + MyArrays.sum(arr1));
        System.out.println("Expected: 21, Result: " + MyArrays.sum(arr2));
        System.out.println("Expected: 75, Result: " + MyArrays.sum(arr3));
    }
}
