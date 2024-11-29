package com.didate.array;

public class MaxSumSubArray {
    
    public static int calculate(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currentMax = 0;

        for(int num :  arr){
            currentMax = Math.max(currentMax + num, num);
            maxSum = Math.max(maxSum, currentMax);
        }

        return maxSum;
    }
}
