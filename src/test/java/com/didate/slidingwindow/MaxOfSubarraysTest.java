package com.didate.slidingwindow;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;

import org.junit.Test;

public class MaxOfSubarraysTest {

    @Test
    public void testMaxOfSubarrays() {

 
        int[] arr6 = { -2, -1, -5, -1, -3, -2, -6, -7 };
        int k6 = 3;
        Integer[] expected6 = { -1, -1, -1, -1, -2, -2 };
        List<Integer> result6 = MaxOfSubarrays.maxOfSubarrays(arr6, arr6.length, k6);
        assertArrayEquals(expected6, result6.toArray());

        int[] arr1 = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k1 = 3;
        Integer[] expected1 = { 3, 3, 5, 5, 6, 7 };
        List<Integer> result1 = MaxOfSubarrays.maxOfSubarrays(arr1, arr1.length, k1);
        assertArrayEquals(expected1, result1.toArray());

        int[] arr2 = { 9, 7, 2, 4, 6, 8 };
        int k2 = 6;
        Integer[] expected2 = { 9 };
        List<Integer> result2 = MaxOfSubarrays.maxOfSubarrays(arr2, arr2.length, k2);
        assertArrayEquals(expected2, result2.toArray());

        int[] arr3 = { 4, 4, 4, 4, 4 };
        int k3 = 2;
        Integer[] expected3 = { 4, 4, 4, 4 };
        List<Integer> result3 = MaxOfSubarrays.maxOfSubarrays(arr3, arr3.length, k3);
        assertArrayEquals(expected3, result3.toArray());

        int[] arr4 = { 5, 1, 3, 8, 7 };
        int k4 = 1;
        Integer[] expected4 = { 5, 1, 3, 8, 7 };
        List<Integer> result4 = MaxOfSubarrays.maxOfSubarrays(arr4, arr4.length, k4);
        assertArrayEquals(expected4, result4.toArray());

        int[] arr5 = { 2, 1, 5, 1, 3, 2, 6, 0, 1 };
        int k5 = 4;
        Integer[] expected5 = { 5, 5, 5, 6, 6, 6 };
        List<Integer> result5 = MaxOfSubarrays.maxOfSubarrays(arr5, arr5.length, k5);
        assertArrayEquals(expected5, result5.toArray());

        

        int[] arr7 = {};
        int k7 = 3;
        Integer[] expected7 = {};
        List<Integer> result7 = MaxOfSubarrays.maxOfSubarrays(arr7, arr7.length, k7);
        assertArrayEquals(expected7, result7.toArray());

        int[] arr8 = { 10 };
        int k8 = 1;
        Integer[] expected8 = { 10 };
        List<Integer> result8 = MaxOfSubarrays.maxOfSubarrays(arr8, arr8.length, k8);
        assertArrayEquals(expected8, result8.toArray());
    }


    @Test
    public void testMaxOfSubarrays2() {

 
        int[] arr6 = { -2, -1, -5, -1, -3, -2, -6, -7 };
        int k6 = 3;
        Integer[] expected6 = { -1, -1, -1, -1, -2, -2 };
        List<Integer> result6 = MaxOfSubarrays.maxOfSubarrays2(arr6, arr6.length, k6);
        assertArrayEquals(expected6, result6.toArray());

        int[] arr1 = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k1 = 3;
        Integer[] expected1 = { 3, 3, 5, 5, 6, 7 };
        List<Integer> result1 = MaxOfSubarrays.maxOfSubarrays2(arr1, arr1.length, k1);
        assertArrayEquals(expected1, result1.toArray());

        int[] arr2 = { 9, 7, 2, 4, 6, 8 };
        int k2 = 6;
        Integer[] expected2 = { 9 };
        List<Integer> result2 = MaxOfSubarrays.maxOfSubarrays2(arr2, arr2.length, k2);
        assertArrayEquals(expected2, result2.toArray());

        int[] arr3 = { 4, 4, 4, 4, 4 };
        int k3 = 2;
        Integer[] expected3 = { 4, 4, 4, 4 };
        List<Integer> result3 = MaxOfSubarrays.maxOfSubarrays2(arr3, arr3.length, k3);
        assertArrayEquals(expected3, result3.toArray());

        int[] arr4 = { 5, 1, 3, 8, 7 };
        int k4 = 1;
        Integer[] expected4 = { 5, 1, 3, 8, 7 };
        List<Integer> result4 = MaxOfSubarrays.maxOfSubarrays2(arr4, arr4.length, k4);
        assertArrayEquals(expected4, result4.toArray());

        int[] arr5 = { 2, 1, 5, 1, 3, 2, 6, 0, 1 };
        int k5 = 4;
        Integer[] expected5 = { 5, 5, 5, 6, 6, 6 };
        List<Integer> result5 = MaxOfSubarrays.maxOfSubarrays2(arr5, arr5.length, k5);
        assertArrayEquals(expected5, result5.toArray());

        

        int[] arr7 = {};
        int k7 = 3;
        Integer[] expected7 = {};
        List<Integer> result7 = MaxOfSubarrays.maxOfSubarrays2(arr7, arr7.length, k7);
        assertArrayEquals(expected7, result7.toArray());

        int[] arr8 = { 10 };
        int k8 = 1;
        Integer[] expected8 = { 10 };
        List<Integer> result8 = MaxOfSubarrays.maxOfSubarrays2(arr8, arr8.length, k8);
        assertArrayEquals(expected8, result8.toArray());
    }

}
