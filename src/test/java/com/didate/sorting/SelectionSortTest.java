package com.didate.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SelectionSortTest {
    @Test
    public void testSort_PositiveNumbers() {
        int[] arr = {64, 25, 12, 22, 11};
        SelectionSort.sort(arr);
        int[] expected = {11, 12, 22, 25, 64};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSort_NegativeNumbers() {
        int[] arr = {-3, -1, -7, -5};
        SelectionSort.sort(arr);
        int[] expected = {-7, -5, -3, -1};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSort_MixedNumbers() {
        int[] arr = {3, -2, 5, -1, 0};
        SelectionSort.sort(arr);
        int[] expected = {-2, -1, 0, 3, 5};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSort_SingleElementArray() {
        int[] arr = {42};
        SelectionSort.sort(arr);
        int[] expected = {42};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSort_AlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        SelectionSort.sort(arr);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSort_AllEqualElements() {
        int[] arr = {7, 7, 7, 7};
        SelectionSort.sort(arr);
        int[] expected = {7, 7, 7, 7};
        assertArrayEquals(expected, arr);
    }
}
