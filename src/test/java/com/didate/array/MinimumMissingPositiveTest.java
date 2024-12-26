package com.didate.array;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumMissingPositiveTest {
    
    @Test
    public void testPositiveNumbersOnly() {
        MinimumMissingPositive obj = new MinimumMissingPositive();
        int[] arr = {1, 2, 3, 4};
        assertEquals(5, obj.missingNumber(arr)); // Smallest missing positive is 5
    }

    @Test
    public void testNegativeNumbersOnly() {
        MinimumMissingPositive obj = new MinimumMissingPositive();
        int[] arr = {-1, -2, -3, -4};
        assertEquals(1, obj.missingNumber(arr)); // Smallest missing positive is 1
    }

    @Test
    public void testMixedNumbers() {
        MinimumMissingPositive obj = new MinimumMissingPositive();
        int[] arr = {3, 4, -1, 1};
        assertEquals(2, obj.missingNumber(arr)); // Smallest missing positive is 2
    }

    @Test
    public void testEmptyArray() {
        MinimumMissingPositive obj = new MinimumMissingPositive();
        int[] arr = {};
        assertEquals(1, obj.missingNumber(arr)); // Smallest missing positive is 1
    }

    @Test
    public void testSingleElementPresent() {
        MinimumMissingPositive obj = new MinimumMissingPositive();
        int[] arr = {1};
        assertEquals(2, obj.missingNumber(arr)); // Smallest missing positive is 2
    }

    @Test
    public void testSingleElementAbsent() {
        MinimumMissingPositive obj = new MinimumMissingPositive();
        int[] arr = {2};
        assertEquals(1, obj.missingNumber(arr)); // Smallest missing positive is 1
    }

    @Test
    public void testUnorderedArray() {
        MinimumMissingPositive obj = new MinimumMissingPositive();
        int[] arr = {7, 8, 9, 11, 12};
        assertEquals(1, obj.missingNumber(arr)); // Smallest missing positive is 1
    }

    @Test
    public void testLargeGapsInArray() {
        MinimumMissingPositive obj = new MinimumMissingPositive();
        int[] arr = {100, 200, 300};
        assertEquals(1, obj.missingNumber(arr)); // Smallest missing positive is 1
    }

    @Test
    public void testArrayContainsZero() {
        MinimumMissingPositive obj = new MinimumMissingPositive();
        int[] arr = {0, 2, 3};
        assertEquals(1, obj.missingNumber(arr)); // Smallest missing positive is 1
    }

    @Test
    public void testDuplicatesInArray() {
        MinimumMissingPositive obj = new MinimumMissingPositive();
        int[] arr = {1, 1, 2, 2, 3, 3};
        assertEquals(4, obj.missingNumber(arr)); // Smallest missing positive is 4
    }
}
