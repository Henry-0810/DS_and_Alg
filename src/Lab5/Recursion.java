package Lab5;

public class Recursion {
    public static int factorial(int n) {
        if(n<0) return -1;
        else if (n ==0|n==1) return 1;
        else return n*factorial(n-1);
    }

    public static double myPow(double x,int y){
        return (y==1)? x:myPow(x,y-1)*x;
    }

    public static String reverse(String str){
        return (str.length() > 1)?  reverse(str.substring(1)) + str.charAt(0): str;
    }
}
