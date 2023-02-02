package Lab3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArraysTest {
    @Test
    public void checkSize(){
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        int currentSize = 4;
        assertEquals(5,MyArrays.insert(arr,currentSize,2,10));
        currentSize++;
        assertEquals(6,MyArrays.insert(arr,currentSize,0,11));
        currentSize++;
        assertEquals(7,MyArrays.insert(arr,currentSize,9,12));
    }

    @Test
    @DisplayName("Out of bounds!")
    public void testOutOfBounds(){
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        int currentSize = 4;
        assertThrows(ArrayIndexOutOfBoundsException.class,()->{
            MyArrays.insert(arr,currentSize,10,10);//out of bounds
        });
    }
}