package Lab1.Q1;

public class TestMyMath {
    public static void main(String[] args) throws Exception {
        //Smallest function testcase(1,2,3)
        //Test1
        System.out.println(MyMath.smallest(1,2,3));
        //Test2
        System.out.println(MyMath.smallest(2,1,3));
        //Test3
        System.out.println(MyMath.smallest(3,2,1));

        //findPow function testcase
        //Test1
        System.out.println(MyMath.findPow(0,0));
        //Test2
        System.out.println(MyMath.findPow(10,4));
        //Test3
        System.out.println(MyMath.findPow(10,-2));

        //sumOf1ToN function testcase
        //Test1
        System.out.println(MyMath.sumOf1ToN(2));
        //Test2
        System.out.println(MyMath.sumOf1ToN(0));
        //Test3
        System.out.println(MyMath.sumOf1ToN(-2));

        //factorial
        //Test1
        System.out.println(MyMath.factorial(0));
        //Test2
        System.out.println(MyMath.factorial(1));
        //Test3
        System.out.println(MyMath.factorial(-1));
        //Test4
        System.out.println(MyMath.factorial(3));

        //prime number
        //Test1
        System.out.println(MyMath.isPrime(3));
        //Test2
        System.out.println(MyMath.isPrime(-2));
        //Test3
        System.out.println(MyMath.isPrime(1));
        //Test4
        System.out.println(MyMath.isPrime(10));
    }
}
