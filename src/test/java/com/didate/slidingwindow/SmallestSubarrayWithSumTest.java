package com.didate.slidingwindow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SmallestSubarrayWithSumTest {
    
    @Test
    public void testFindMinSubArray() {
        assertEquals(1, SmallestSubarrayGivenSum.lengthSmallestSubarrayGivenSum(7, new int[]{2, 1, 5, 2, 8}));
        assertEquals(2, SmallestSubarrayGivenSum.lengthSmallestSubarrayGivenSum(7, new int[]{2, 1, 5, 2, 3, 2}));
        assertEquals(2, SmallestSubarrayGivenSum.lengthSmallestSubarrayGivenSum(7, new int[]{2, 1, 5, 2, 3, 1, 5, 1}));
        assertEquals(3, SmallestSubarrayGivenSum.lengthSmallestSubarrayGivenSum(8, new int[]{3, 4, 1, 1, 6}));
        assertEquals(1, SmallestSubarrayGivenSum.lengthSmallestSubarrayGivenSum(8, new int[]{3, 4, 1, 1, 8}));
        assertEquals(0, SmallestSubarrayGivenSum.lengthSmallestSubarrayGivenSum(20, new int[]{2, 1, 5, 2, 8}));
        assertEquals(5, SmallestSubarrayGivenSum.lengthSmallestSubarrayGivenSum(15, new int[]{1, 2, 3, 4, 5}));
    }
}
