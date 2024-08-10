package com.didate.slidingwindow;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class FirstNegativeInWindowTest {
    
    @Test
    public void testFirstNegativeInWindow() {
        // Test case 1: General case with multiple negative numbers
        int[] arr1 = {12, -1, -7, 8, 15, 30, 16, 28};
        int k1 = 3;
        int[] expected1 = {-1, -1, -7, 0, 0, 0};
        assertArrayEquals(expected1, FirstNegativeInWindow.firstNegativeInWindow(arr1, k1));

        // Test case 2: Array with no negative numbers
        int[] arr2 = {4, 3, 5, 7, 8, 9};
        int k2 = 3;
        int[] expected2 = {0, 0, 0, 0};
        assertArrayEquals(expected2, FirstNegativeInWindow.firstNegativeInWindow(arr2, k2));

        // Test case 3: Array with all negative numbers
        int[] arr3 = {-5, -2, -3, -8, -6};
        int k3 = 2;
        int[] expected3 = {-5, -2, -3, -8};
        assertArrayEquals(expected3, FirstNegativeInWindow.firstNegativeInWindow(arr3, k3));

        // Test case 4: Window size equals array size
        int[] arr4 = {-1, 2, 3, -4, 5};
        int k4 = 5;
        int[] expected4 = {-1};
        assertArrayEquals(expected4, FirstNegativeInWindow.firstNegativeInWindow(arr4, k4));

        // Test case 5: Single element windows
        int[] arr5 = {7, -2, 8, -9, 3};
        int k5 = 1;
        int[] expected5 = {0, -2, 0, -9, 0};
        assertArrayEquals(expected5, FirstNegativeInWindow.firstNegativeInWindow(arr5, k5));

        // Test case 6: Array with one element
        int[] arr6 = {-10};
        int k6 = 1;
        int[] expected6 = {-10};
        assertArrayEquals(expected6, FirstNegativeInWindow.firstNegativeInWindow(arr6, k6));

        // Test case 7: Mix of negative and positive, with repeating negatives
        int[] arr7 = {1, -1, 2, -2, -3, 3};
        int k7 = 3;
        int[] expected7 = {-1, -1, -2, -2};
        assertArrayEquals(expected7, FirstNegativeInWindow.firstNegativeInWindow(arr7, k7));

        // Test case 8: Large window size greater than array length
        int[] arr8 = {-1, 2, -3};
        int k8 = 4;
        int[] expected8 = {};  // No window can be formed
        assertArrayEquals(expected8, FirstNegativeInWindow.firstNegativeInWindow(arr8, k8));
    }
}
