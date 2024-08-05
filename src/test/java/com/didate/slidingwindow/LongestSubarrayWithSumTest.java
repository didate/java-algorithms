package com.didate.slidingwindow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestSubarrayWithSumTest {
    
    @Test
    public void testLengthLongestSubarrayWithSum() {
        assertEquals(3, LongestSubarrayWithSum.lengthLongestSubarrayWithSum(8, new int[]{1, 2, 3, 4, 5}));
        assertEquals(0, LongestSubarrayWithSum.lengthLongestSubarrayWithSum(5, new int[]{6, 7, 8}));
        assertEquals(5, LongestSubarrayWithSum.lengthLongestSubarrayWithSum(20, new int[]{1, 2, 3, 4, 5}));
        assertEquals(2, LongestSubarrayWithSum.lengthLongestSubarrayWithSum(3, new int[]{4, 1, 2, 1}));
        assertEquals(0, LongestSubarrayWithSum.lengthLongestSubarrayWithSum(1, new int[]{2}));
        assertEquals(5, LongestSubarrayWithSum.lengthLongestSubarrayWithSum(15, new int[]{2, 3, 5, 2, 1, 4}));
        assertEquals(2, LongestSubarrayWithSum.lengthLongestSubarrayWithSum(10, new int[]{4, 4, 4, 4}));
        assertEquals(0, LongestSubarrayWithSum.lengthLongestSubarrayWithSum(10, new int[]{}));
    }
}
