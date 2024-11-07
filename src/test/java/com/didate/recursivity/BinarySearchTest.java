package com.didate.recursivity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinarySearchTest {

    private final BinarySearch instance = new BinarySearch();

    @Test
    public void testTargetFound() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 5;
        int expectedIndex = 4;
        int actualIndex = instance.search(arr, target, 0, arr.length - 1);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testTargetAtStart() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 1;
        int expectedIndex = 0;
        int actualIndex = instance.search(arr, target, 0, arr.length - 1);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testTargetAtEnd() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 7;
        int expectedIndex = 6;
        int actualIndex = instance.search(arr, target, 0, arr.length - 1);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testTargetNotFound() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 8;
        int expectedIndex = -1;
        int actualIndex = instance.search(arr, target, 0, arr.length - 1);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int target = 5;
        int expectedIndex = -1;
        int actualIndex = instance.search(arr, target, 0, arr.length - 1);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testSingleElementFound() {
        int[] arr = {5};
        int target = 5;
        int expectedIndex = 0;
        int actualIndex = instance.search(arr, target, 0, arr.length - 1);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testSingleElementNotFound() {
        int[] arr = {3};
        int target = 5;
        int expectedIndex = -1;
        int actualIndex = instance.search(arr, target, 0, arr.length - 1);
        assertEquals(expectedIndex, actualIndex);
    }
}
