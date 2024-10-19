package com.didate.slidingwindow;

public class MaxSumSubarray {
    

    /**
     * Given an integer array nums, find the subarray with the largest sum, and return its sum.
     * {-2, 1, -3, 4, -1, 2, 1, -5, 4} => 6
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Input array cannot be empty");
        }

        int currentSum = nums[0];
        int maxSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
}
