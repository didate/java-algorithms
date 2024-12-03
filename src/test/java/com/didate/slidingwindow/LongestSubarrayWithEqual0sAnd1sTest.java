package com.didate.slidingwindow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class LongestSubarrayWithEqual0sAnd1sTest {

    @Test
    public void testBasicCase1() {
        int[] nums = {0, 1};
        assertEquals(2, LongestSubarrayWithEqual0sAnd1s.findMaxLength(nums));
    }

    @Test
    public void testBasicCase2() {
        int[] nums = {0, 1, 0};
        assertEquals(2, LongestSubarrayWithEqual0sAnd1s.findMaxLength(nums));
    }

    @Test
    public void testLargerArray() {
        int[] nums = {0, 0, 1, 0, 1, 1, 0};
        assertEquals(6, LongestSubarrayWithEqual0sAnd1s.findMaxLength(nums));
    }

    @Test
    public void testMixedOnesAndZeros() {
        int[] nums = {1, 1, 1, 0, 1, 0, 0, 1};
        assertEquals(6, LongestSubarrayWithEqual0sAnd1s.findMaxLength(nums));
    }

    @Test
    public void testEntireArray() {
        int[] nums = {0, 1, 1, 0, 0, 0, 1, 1};
        assertEquals(8, LongestSubarrayWithEqual0sAnd1s.findMaxLength(nums));
    }

    @Test
    public void testNoEqualSubarray() {
        int[] nums = {0, 0, 0, 1, 1, 1, 0, 0, 1, 1};
        assertEquals(10, LongestSubarrayWithEqual0sAnd1s.findMaxLength(nums));
    }

    @Test
    public void testAllZeros() {
        int[] nums = {0, 0, 0, 0};
        assertEquals(0, LongestSubarrayWithEqual0sAnd1s.findMaxLength(nums));
    }

    @Test
    public void testAllOnes() {
        int[] nums = {1, 1, 1, 1};
        assertEquals(0, LongestSubarrayWithEqual0sAnd1s.findMaxLength(nums));
    }

    @Test
    public void testAlternatingOnesAndZeros() {
        int[] nums = {0, 1, 0, 1, 0, 1, 0, 1};
        assertEquals(8, LongestSubarrayWithEqual0sAnd1s.findMaxLength(nums));
    }

    @Test
    public void testSingleElement() {
        int[] nums = {1};
        assertEquals(0, LongestSubarrayWithEqual0sAnd1s.findMaxLength(nums));
    }
}