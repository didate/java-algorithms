package com.didate.slidingwindow;

public class SmallestSubarrayGivenSum {

    /**
     * Given an array of integers and a positive integer S,
     * find the length of the smallest contiguous subarray whose sum is greater than
     * or equal to S.
     * Return 0 if no such subarray exists.
     * Example:
     * Input: arr = [2, 1, 5, 2, 8], S = 7
     * Output: 1 (subarray [8])
     */
    public static int lengthSmallestSubarrayGivenSum(int s, int[] arr) {
        int windowSum = 0;
        int minLength = Integer.MAX_VALUE;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd]; 
            while (windowSum >= s) {
                minLength = Math.min(minLength, windowEnd - windowStart + 1);
                windowSum -= arr[windowStart]; 
                windowStart++; 
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}