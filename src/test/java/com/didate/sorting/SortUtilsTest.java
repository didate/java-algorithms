package com.didate.sorting;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SortUtilsTest {
    
    @Test
    public void testSwap() {
        int[] arr = {1, 2, 3, 4, 5};
        SortUtils.swap(arr, 1, 3);
        int[] expected = {1, 4, 3, 2, 5};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSwap_SameIndex() {
        int[] arr = {1, 2, 3, 4, 5};
        SortUtils.swap(arr, 2, 2); // Swapping the same index
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSwap_OutOfOrder() {
        int[] arr = {5, 4, 3, 2, 1};
        SortUtils.swap(arr, 0, 4);
        int[] expected = {1, 4, 3, 2, 5};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMin_PositiveNumbers() {
        int[] arr = {10, 2, 3, 1, 5};
        int result = SortUtils.min(arr);
        assertEquals(3, result); // Index of 1
    }

    @Test
    public void testMin_NegativeNumbers() {
        int[] arr = {-5, -1, -10, 0};
        int result = SortUtils.min(arr);
        assertEquals(2, result); // Index of -10
    }

    @Test
    public void testMin_SingleElementArray() {
        int[] arr = {42};
        int result = SortUtils.min(arr);
        assertEquals(0, result); // Single element, index 0
    }

    @Test
    public void testMin_AlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int result = SortUtils.min(arr);
        assertEquals(0, result); // Minimum element is at index 0
    }

    @Test
    public void testMin_AllEqualElements() {
        int[] arr = {7, 7, 7, 7};
        int result = SortUtils.min(arr);
        assertEquals(0, result); // First occurrence of minimum
    }
}
