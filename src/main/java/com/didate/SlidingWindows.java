package com.didate;

public class SlidingWindows {
    

    /**
     * Given an array of positive integers nums and an integer k, 
     * find the length of the longest subarray whose sum is less than or equal to k
     */
    public int lengthLongestSubarraySumLessThanEqualK(int[] nums, int k){

        int left = 0;
        int sum = 0;
        int length=0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum > k ) {
                sum -= nums[left];
                left++;
            }
            length = Math.max(length, right-left+1);
        }
        return length;
    }
    
    /**
     * You are given an array of binary int s ( containing only 0 and 1).
     * You may choose up to one "0" and flip it to a "1".
     * What is the length of the longest subarray achievable that contains only "1"?
     */
    public int lengthOfLongestSubarrayContaining0(int[] nums){

        //s = "110110111"
        int left = 0;
        int length=0;
        int numberOf0=0;

        for (int right = 0; right < nums.length; right++) {

            if(nums[right]==0){
                numberOf0++;
            }
            while (numberOf0 > 1) {
                if(nums[left]==0) 
                    numberOf0--;
                left++;
            }
            length = Math.max(length, right-left+1);
            
        }
        return length;
    }
   

}


