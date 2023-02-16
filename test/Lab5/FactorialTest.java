package Lab5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    public void checkFactorial(){
        assertEquals(120, Recursion.factorial(5));
        assertEquals(-1, Recursion.factorial(-10));
        assertEquals(1, Recursion.factorial(1));
        assertEquals(1, Recursion.factorial(0));
    }

    @Test
    public void checkFactorialDouble(){
        assertEquals(0.027, Recursion.myPow(0.3,3));
        assertEquals(512, Recursion.myPow(8,3));
        assertEquals(0.3, Recursion.myPow(0.3,1));
    }

    @Test
    public void checkReverseWords(){
        assertEquals("!olleH", Recursion.reverse("Hello!"));
        assertEquals("nam a ma I",Recursion.reverse("I am a man"));
        assertEquals("s",Recursion.reverse("s"));
    }

}