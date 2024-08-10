package com.didate.slidingwindow;

public class MaximumOfAllSubarraysOfSizeK {
    
    /**
     * Given an array and an integer k, find the maximum element in every contiguous subarray of size k.
     * Example:
     *      Input: arr = [1, 3, -1, -3, 5, 3, 6, 7], k = 3
     *      Output: [3, 3, 5, 5, 6, 7]
     */
    public static int[] maxOfSubarrays(int[] arr, int k) {
        int[] result = new int[arr.length - k + 1];
        
        for (int i = 0; i <= arr.length-k; i++) {
            int max = arr[i];

            for(int j=1; j<k; j++){
                if(arr[i+j]>max){
                    max = arr[i+j];
                }
            }
            result[i]= max;
        }
        return result;
    }
}
