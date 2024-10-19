package com.didate.slidingwindow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxSumSubarrayTest {
 
    @Test
    public void testMaxSubArray(){
        
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expected1 = 6;  
        assertEquals(expected1, MaxSumSubarray.maxSubArray(nums1));

        
        int[] nums2 = {-3, -4, -2, -1, -5};
        int expected2 = -1;  
        assertEquals(expected2, MaxSumSubarray.maxSubArray(nums2));

        
        int[] nums3 = {1, 2, 3, 4, 5};
        int expected3 = 15;  
        assertEquals(expected3, MaxSumSubarray.maxSubArray(nums3));

        
        int[] nums4 = {5};
        int expected4 = 5;  
        assertEquals(expected4, MaxSumSubarray.maxSubArray(nums4));

        
        int[] nums5 = {-5};
        int expected5 = -5;  
        assertEquals(expected5, MaxSumSubarray.maxSubArray(nums5));

        int[] nums6 = {1};
        int expected6 = 1;  
        assertEquals(expected6, MaxSumSubarray.maxSubArray(nums6));

    }
}
