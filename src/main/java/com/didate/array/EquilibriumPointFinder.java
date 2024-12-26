package com.didate.array;


/**
 * Given an array arr of non-negative numbers. 
 * The task is to find the first equilibrium point in an array. 
 * The equilibrium point in an array is an index (or position) such 
 * that the sum of all elements before that index is the same as the sum of elements after it.
 * Note: Return equilibrium point in 1-based indexing. Return -1 if no such point exists. 
 */
public class EquilibriumPointFinder {
    
    public static int findEquilibriumPoint(int[] arr) {
        int n = arr.length;

        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            if (leftSum == totalSum - leftSum - arr[i]) {
                return i + 1; 
            }
            leftSum += arr[i];
        }
        return -1;
    }
}
