package Lab1.Q1;

public class MyMath {
    public static int smallest(int num1, int num2, int num3) {
        int smallest = Integer.MAX_VALUE;
        int[] numArr = {num1,num2,num3};
        for (int num : numArr) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }

    public static double findPow(int a, int b){
        double result = 1;
        if(b > 0){
            for (int i = 0; i < b; i++) {
                result *= a;
            }
        }
        else if(b < 0){
            for (int i = 0; i < -b; i++) {
                result *= a;
            }
            return 1/result;
        }
        else{
            return 1;
        }
        return result;
    }

    public static int sumOf1ToN(int n) throws Exception {
        int sum = 0;
        if(n > 1){
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
        }
        else if(n == 0){
            return 1;
        }
        else{
            throw new Exception("input must be positive integer");
        }
        return sum;
    }

    //recursive
    public static int factorial(int n) throws Exception{
        if(n < 0){
            throw new Exception("input must be positive integer");
        }
        else if(n == 1 || n == 0){
            return 1;
        }
        else{
            return factorial(n-1)*(n);
        }
    }

    //iterative method
//    public static int factorial(int n){
//        int ans = 1;
//        for (int i = n; i > 0; i--) {
//            ans *= n;
//        }
//        return ans;
//    }
    public static Boolean isPrime(int x) throws Exception {
        return x%2 != 0 && x > 1;
    }
}