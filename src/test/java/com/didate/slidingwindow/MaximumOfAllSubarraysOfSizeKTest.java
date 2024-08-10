package com.didate.slidingwindow;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MaximumOfAllSubarraysOfSizeKTest {
    @Test
    public void testMaxOfSubarrays() {
        assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, MaximumOfAllSubarraysOfSizeK.maxOfSubarrays(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3));

        assertArrayEquals(new int[]{4, 4, 4}, MaximumOfAllSubarraysOfSizeK.maxOfSubarrays(new int[]{4, 4, 4, 4}, 2));

        assertArrayEquals(new int[]{7}, MaximumOfAllSubarraysOfSizeK.maxOfSubarrays(new int[]{1, 3, 7, 2, 5}, 5));

        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, MaximumOfAllSubarraysOfSizeK.maxOfSubarrays(new int[]{1, 2, 3, 4, 5}, 1));

        assertArrayEquals(new int[]{5}, MaximumOfAllSubarraysOfSizeK.maxOfSubarrays(new int[]{5}, 1));

        assertArrayEquals(new int[]{9, 8, 7, 6}, MaximumOfAllSubarraysOfSizeK.maxOfSubarrays(new int[]{9, 8, 7, 6, 5}, 2));

        assertArrayEquals(new int[]{4, 5, 6}, MaximumOfAllSubarraysOfSizeK.maxOfSubarrays(new int[]{1, 2, 3, 4, 5, 6}, 4));

        assertArrayEquals(new int[]{3, 3, 5, 5}, MaximumOfAllSubarraysOfSizeK.maxOfSubarrays(new int[]{1, -1, 3, -2, 5, -3}, 3));

        assertArrayEquals(new int[]{3, 3, 3, 3, 3, 3}, MaximumOfAllSubarraysOfSizeK.maxOfSubarrays(new int[]{1, 3, 1, 3, 1, 3, 1, 3}, 3));

        assertArrayEquals(new int[]{}, MaximumOfAllSubarraysOfSizeK.maxOfSubarrays(new int[]{2, 1}, 3));
    }
}
