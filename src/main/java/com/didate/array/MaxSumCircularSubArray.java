package com.didate.array;

/**
 * Given an array of integers arr[] in a circular fashion. 
 * Find the maximum subarray sum that we can get if we assume the array to be circular.
 * Input: arr[] = [8, -8, 9, -9, 10, -11, 12]
 * Output: 22
 * Explanation: Starting from the last element of the array, i.e, 12, and moving in a circular fashion, 
 * we have max subarray as 12, 8, -8, 9, -9, 10, which gives maximum sum as 22.
 */
public class MaxSumCircularSubArray {
    
    public static int calculate(int[] arr){
        int totalSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int currentMax = 0;
        int minSum = Integer.MAX_VALUE;
        int currentMin = 0;

        for (int num : arr) {
            
            currentMax = Math.max(currentMax + num, num);
            maxSum = Math.max(maxSum, currentMax);

            
            currentMin = Math.min(currentMin + num, num);
            minSum = Math.min(minSum, currentMin);

            
            totalSum += num;
        }

        
        if (maxSum < 0) {
            return maxSum;
        }

        
        return Math.max(maxSum, totalSum - minSum);
    }
}
