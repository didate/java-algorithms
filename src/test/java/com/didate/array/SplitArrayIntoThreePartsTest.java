package com.didate.array;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class SplitArrayIntoThreePartsTest {

    private final SplitArrayIntoThreeParts obj = new SplitArrayIntoThreeParts();

    @Test
    public void testValidSplit() {
        int[] arr = {0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1};
        List<Integer> result = obj.findSplit(arr);
        assertEquals(List.of(2, 7), result); 
    }

    @Test
    public void testAnotherValidSplit() {
        int[] arr = {1, 2, 3, 0, 0, 6, 0, 0, 6};
        List<Integer> result = obj.findSplit(arr);
        assertEquals(List.of(2, 5), result); 
    }

    @Test
    public void testNoSplitPossible() {
        int[] arr = {1, 1, 1, 1};
        List<Integer> result = obj.findSplit(arr);
        assertEquals(List.of(-1, -1), result); 
    }

    @Test
    public void testAllZeros() {
        int[] arr = {0, 0, 0, 0, 0};
        List<Integer> result = obj.findSplit(arr);
        assertEquals(List.of(0, 1), result); 
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        List<Integer> result = obj.findSplit(arr);
        assertEquals(List.of(-1, -1), result); 
    }

    @Test
    public void testSingleElementArray() {
        int[] arr = {1};
        List<Integer> result = obj.findSplit(arr);
        assertEquals(List.of(-1, -1), result); 
    }

    @Test
    public void testNegativeNumbers() {
        int[] arr = {-3, -3, -3, 9};
        List<Integer> result = obj.findSplit(arr);
        assertEquals(List.of(-1, -1), result); 
    }

    @Test
    public void testLargeArray() {
        int[] arr = new int[300];
        for (int i = 0; i < 300; i++) {
            arr[i] = 1;
        }
        List<Integer> result = obj.findSplit(arr);
        assertEquals(List.of(99, 199), result); 
    }
}