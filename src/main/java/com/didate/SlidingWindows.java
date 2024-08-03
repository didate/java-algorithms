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
    /**
     * Given an array of positive integers nums and an integer k, 
     * return the number of subarrays where the product of all the elements in the subarray is strictly less than k
     * Example : nums = [10, 5, 2, 6], k = 100 , result = 8 subarrays =>
     * [10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
     * @param nums
     * @param k
     * @return
     */
    public int numSubarrayProductLessThanK(int[] nums, int k){
        int left =0;
        int result=0;
        int product=1;

        for (int right = 0; right < nums.length; right++) {
            product *=nums[right];

            while(product >= k){
                product /=nums[left];
                left++;
            }
            result += right - left +1;
        }
        return result;
    }
   

}


