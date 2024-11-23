package com.didate.array;

import org.junit.Test;
import static org.junit.Assert.*;

public class RotateArrayTest {

    @Test
    public void testRotateByOne() {
        RotateArray rotator = new RotateArray();
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {2, 3, 4, 5, 1};
        assertArrayEquals(expected, rotator.rotateByOne(arr));
    }

    @Test
    public void testRotateByD_NormalCase() {
        RotateArray rotator = new RotateArray();
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {3, 4, 5, 1, 2};
        assertArrayEquals(expected, rotator.rotateByD(arr, 2));
    }

    @Test
    public void testRotateByD_RotateFullLength() {
        RotateArray rotator = new RotateArray();
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5}; // Rotating by array length results in the same array
        assertArrayEquals(expected, rotator.rotateByD(arr, 5));
    }

    @Test
    public void testRotateByD_RotateMoreThanLength() {
        RotateArray rotator = new RotateArray();
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {3, 4, 5, 1, 2};// Rotating by d > length is equivalent to d % length
        assertArrayEquals(expected, rotator.rotateByD(arr, 7));
    }

    @Test
    public void testRotateByD_SingleElementArray() {
        RotateArray rotator = new RotateArray();
        int[] arr = {1};
        int[] expected = {1}; // Rotating a single-element array results in the same array
        assertArrayEquals(expected, rotator.rotateByD(arr, 3));
    }

    @Test
    public void testReverse() {
        RotateArray rotator = new RotateArray();
        int[] arr = {1, 2, 3, 4, 5};
        rotator.reverse(arr, 1, 3); // Reverse indices 1 to 3
        int[] expected = {1, 4, 3, 2, 5};
        assertArrayEquals(expected, arr);
    }
}