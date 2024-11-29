package com.didate.array;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxSumSubArrayTest {
    
    @Test
    public void testPositiveNumbers() {
        int[] arr = {1, 2, 3, 4};
        assertEquals(10, MaxSumSubArray.calculate(arr));
    }

    @Test
    public void testMixedNumbers() {
        int[] arr = {1, -2, 3, 4, -1, 2};
        assertEquals(8, MaxSumSubArray.calculate(arr));
    }

    @Test
    public void testAllNegativeNumbers() {
        int[] arr = {-2, -3, -1, -4};
        assertEquals(-1, MaxSumSubArray.calculate(arr));
    }

    @Test
    public void testSingleElement() {
        int[] arr = {5};
        assertEquals(5, MaxSumSubArray.calculate(arr));
    }
}
