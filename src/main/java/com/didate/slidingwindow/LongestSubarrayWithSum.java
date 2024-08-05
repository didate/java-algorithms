package com.didate.slidingwindow;

public class LongestSubarrayWithSum {
    /**
     * Given an array of positive integers nums and an integer k,
     * find the length of the longest subarray whose sum is less than or equal to k
     */
    public static int lengthLongestSubarrayWithSum(int k, int[] nums) {

        int left = 0;
        int sum = 0;
        int length = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum > k) {
                sum -= nums[left];
                left++;
            }
            length = Math.max(length, right - left + 1);
        }
        return length;
    }

}
