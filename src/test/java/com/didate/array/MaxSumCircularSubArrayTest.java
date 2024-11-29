package com.didate.array;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxSumCircularSubArrayTest {
    
     @Test
    public void testSingleElement() {
        int[] arr = {5};
        assertEquals(5, MaxSumCircularSubArray.calculate(arr));
    }

    @Test
    public void testAllPositive() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(15, MaxSumCircularSubArray.calculate(arr)); // Sum of all elements
    }

    @Test
    public void testAllNegative() {
        int[] arr = {-3, -2, -5, -1};
        assertEquals(-1, MaxSumCircularSubArray.calculate(arr)); // Max single element
    }

    @Test
    public void testMixedNumbers() {
        int[] arr = {5, -3, 5};
        assertEquals(10, MaxSumCircularSubArray.calculate(arr)); // Wrapping case
    }

    @Test
    public void testWrapAround() {
        int[] arr = {8, -1, -3, 8};
        assertEquals(16, MaxSumCircularSubArray.calculate(arr)); // Wrapping around array
    }

    @Test
    public void testNonCircularMaximum() {
        int[] arr = {3, -2, 2, -3};
        assertEquals(3, MaxSumCircularSubArray.calculate(arr)); // Normal subarray maximum
    }

    @Test
    public void testEntireArrayCircular() {
        int[] arr = {2, -1, 2, 1, -4, 2, 8};
        assertEquals(14, MaxSumCircularSubArray.calculate(arr)); // Circular subarray includes both ends
    }

    @Test
    public void testMultipleNegativesAndPositives() {
        int[] arr = {-2, 4, -5, 4, -5, 4, -5};
        assertEquals(4, MaxSumCircularSubArray.calculate(arr)); // Wrapping
    }

    @Test
    public void testAlternatingNegativesAndPositives() {
        int[] arr = {1, -2, 3, -2, 5};
        assertEquals(7, MaxSumCircularSubArray.calculate(arr)); // Circular sum includes all elements
    }

    @Test
    public void testAllZeros() {
        int[] arr = {0, 0, 0, 0};
        assertEquals(0, MaxSumCircularSubArray.calculate(arr)); // Sum is 0
    }
}
