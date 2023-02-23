package Lab6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MyArraysTest {

    @Test
    void testSelectionSort(){
        int[] actual = {10,55,67,82,3,4,69};
        MyArrays.selectionSort(actual);
        int[] expected = {3,4,10,55,67,69,82};
        assertEquals(Arrays.toString(expected),Arrays.toString(actual));
    }

    @Test
    void testInsertionSort(){
        int[] actual = {10,55,67,82,3,4,69};
        MyArrays.insertionSort(actual);
        int[] expected = {3,4,10,55,67,69,82};
        assertEquals(Arrays.toString(expected),Arrays.toString(actual));
    }

    @Test
    void testBinarySearch(){
        int[] arr = {10,55,67,82,3,4,69};
        MyArrays.insertionSort(arr);
        assertEquals(3,MyArrays.recursiveBinarySearch(arr,55,0,arr.length));
    }
}