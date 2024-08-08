package com.didate.slidingwindow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestSubarrayWithTwoDistinctFruitsTest {

    @Test
    public void testLongestSubarrayWithTwoDistinctFruits() {
        // Test case 1: Simple case with two types of fruits
        assertEquals(4, LongestSubarrayWithTwoDistinctFruits
                .longestSubarrayWithTwoDistinctFruits(new char[] { 'A', 'B', 'A', 'A' }));

        // Test case 2: Simple case with more than two types of fruits
        assertEquals(3, LongestSubarrayWithTwoDistinctFruits
                .longestSubarrayWithTwoDistinctFruits(new char[] { 'A', 'B', 'C', 'A', 'C' }));

        // Test case 3: More complex case with two types of fruits
        assertEquals(6, LongestSubarrayWithTwoDistinctFruits
                .longestSubarrayWithTwoDistinctFruits(new char[] { 'A', 'A', 'A', 'B', 'C', 'B', 'B', 'C', 'C' }));

        // Test case 4: Edge case with only one type of fruit
        assertEquals(7, LongestSubarrayWithTwoDistinctFruits
                .longestSubarrayWithTwoDistinctFruits(new char[] { 'A', 'A', 'A', 'A', 'A', 'A', 'A' }));

        // Test case 5: Edge case with three types of fruits
        assertEquals(5, LongestSubarrayWithTwoDistinctFruits
                .longestSubarrayWithTwoDistinctFruits(new char[] { 'A', 'B', 'C', 'B', 'B', 'C' }));

        // Test case 6: Edge case with no fruits
        assertEquals(0, LongestSubarrayWithTwoDistinctFruits.longestSubarrayWithTwoDistinctFruits(new char[] {}));

        // Test case 7: Edge case with one fruit
        assertEquals(1, LongestSubarrayWithTwoDistinctFruits.longestSubarrayWithTwoDistinctFruits(new char[] { 'A' }));

        // Test case 8: Edge case with all distinct fruits
        assertEquals(2, LongestSubarrayWithTwoDistinctFruits
                .longestSubarrayWithTwoDistinctFruits(new char[] { 'A', 'B', 'C', 'D' }));

        // Test case 9: Edge case with alternating fruits
        assertEquals(7, LongestSubarrayWithTwoDistinctFruits
                .longestSubarrayWithTwoDistinctFruits(new char[] { 'A', 'B', 'A', 'B', 'A', 'B', 'A', 'C', 'D' }));

        // Test case 10: Longer sequence of two types of fruits
        assertEquals(11, LongestSubarrayWithTwoDistinctFruits.longestSubarrayWithTwoDistinctFruits(
                new char[] { 'A', 'A', 'B', 'B', 'A', 'A', 'A', 'A', 'B', 'B', 'B' }));
    }
}
