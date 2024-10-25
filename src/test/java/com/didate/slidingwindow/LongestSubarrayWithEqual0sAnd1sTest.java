package com.didate.slidingwindow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestSubarrayWithEqual0sAnd1sTest {
    @Test
    public void testFindMaxLength() {
        
        // Test case 1: Basic case
        int[] nums1 = {0, 1};
        assertEquals(2, LongestSubarrayWithEqual0sAnd1s.findMaxLength(nums1));

        // Test case 2: Another basic case
        int[] nums2 = {0, 1, 0};
        assertEquals(2, LongestSubarrayWithEqual0sAnd1s.findMaxLength(nums2));

        // Test case 3: Larger array
        int[] nums3 = {0, 0, 1, 0, 1, 1, 0};
        assertEquals(6, LongestSubarrayWithEqual0sAnd1s.findMaxLength(nums3));

        // Test case 4: Mixed ones and zeros
        int[] nums4 = {1, 1, 1, 0, 1, 0, 0, 1};
        assertEquals(4, LongestSubarrayWithEqual0sAnd1s.findMaxLength(nums4));

        // Test case 5: Entire array
        int[] nums5 = {0, 1, 1, 0, 0, 0, 1, 1};
        assertEquals(8, LongestSubarrayWithEqual0sAnd1s.findMaxLength(nums5));

        // Test case 6: No equal subarray
        int[] nums6 = {0, 0, 0, 1, 1, 1, 0, 0, 1, 1};
        assertEquals(10, LongestSubarrayWithEqual0sAnd1s.findMaxLength(nums6));

        // Test case 7: All zeros
        int[] nums7 = {0, 0, 0, 0};
        assertEquals(0, LongestSubarrayWithEqual0sAnd1s.findMaxLength(nums7));

        // Test case 8: All ones
        int[] nums8 = {1, 1, 1, 1};
        assertEquals(0, LongestSubarrayWithEqual0sAnd1s.findMaxLength(nums8));

        // Test case 9: Alternating ones and zeros
        int[] nums9 = {0, 1, 0, 1, 0, 1, 0, 1};
        assertEquals(8, LongestSubarrayWithEqual0sAnd1s.findMaxLength(nums9));

        // Test case 10: Single element
        int[] nums10 = {1};
        assertEquals(0, LongestSubarrayWithEqual0sAnd1s.findMaxLength(nums10));
    }
}
