package com.didate.sorting;

import org.junit.Test;
import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void testSortAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        BubbleSort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSortReverseOrderArray() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        BubbleSort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSortUnsortedArray() {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        int[] expected = {1, 1, 2, 3, 4, 5, 5, 6, 9};
        BubbleSort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSortArrayWithDuplicates() {
        int[] arr = {4, 4, 4, 4, 4};
        int[] expected = {4, 4, 4, 4, 4};
        BubbleSort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSortEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        BubbleSort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSortSingleElementArray() {
        int[] arr = {1};
        int[] expected = {1};
        BubbleSort.sort(arr);
        assertArrayEquals(expected, arr);
    }
}
