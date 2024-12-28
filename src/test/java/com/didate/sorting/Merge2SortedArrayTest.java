package com.didate.sorting;

import org.junit.Test;
import static org.junit.Assert.*;

public class Merge2SortedArrayTest {

    @Test
    public void testMerge_DistinctElements() {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, Merge2SortedArray.merge(arr1, arr2));
    }

    @Test
    public void testMerge_WithDuplicates() {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {3, 4, 5};
        int[] expected = {1, 3, 3, 4, 5, 5};
        assertArrayEquals(expected, Merge2SortedArray.merge(arr1, arr2));
    }

    @Test
    public void testMerge_OneArrayEmpty() {
        int[] arr1 = {};
        int[] arr2 = {1, 2, 3};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, Merge2SortedArray.merge(arr1, arr2));
    }

    @Test
    public void testMerge_BothArraysEmpty() {
        int[] arr1 = {};
        int[] arr2 = {};
        int[] expected = {};
        assertArrayEquals(expected, Merge2SortedArray.merge(arr1, arr2));
    }

    @Test
    public void testMerge_SameArrays() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] expected = {1, 1, 2, 2, 3, 3};
        assertArrayEquals(expected, Merge2SortedArray.merge(arr1, arr2));
    }

    @Test
    public void testMerge_OneElementEach() {
        int[] arr1 = {1};
        int[] arr2 = {1};
        int[] expected = {1, 1};
        assertArrayEquals(expected, Merge2SortedArray.merge(arr1, arr2));
    }
}
