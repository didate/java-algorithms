package com.didate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class SlidingWindows {

    /**
     * Given an array of positive integers nums and an integer k,
     * find the length of the longest subarray whose sum is less than or equal to k
     */
    public int lengthLongestSubarraySumLessThanEqualK(int[] nums, int k) {

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

    /**
     * You are given an array of binary int s ( containing only 0 and 1).
     * You may choose up to one "0" and flip it to a "1".
     * What is the length of the longest subarray achievable that contains only "1"?
     */
    public int lengthOfLongestSubarrayContaining0(int[] nums) {

        int left = 0;
        int length = 0;
        int numberOf0 = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                numberOf0++;
            }
            while (numberOf0 > 1) {
                if (nums[left] == 0)
                    numberOf0--;
                left++;
            }
            length = Math.max(length, right - left + 1);

        }
        return length;
    }

    /**
     * Given an array of positive integers nums and an integer k,
     * return the number of subarrays where the product of all the elements in the
     * subarray is strictly less than k
     * Example : nums = [10, 5, 2, 6], k = 100 , result = 8 subarrays =>
     * [10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
     * 
     * @param nums
     * @param k
     * @return
     */
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0;
        int result = 0;
        int product = 1;

        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];

            while (product >= k) {
                product /= nums[left];
                left++;
            }
            result += right - left + 1;
        }
        return result;
    }

    /**
     * Given an unsorted array arr of size n that contains only non negative
     * integers,
     * find a sub-array (continuous elements) that has sum equal to k.
     * You mainly need to return the left and right indexes(1-based indexing) of
     * that subarray.
     * In case of multiple subarrays, return the subarray indexes which come first
     * on moving from left to right.
     * If no such subarray exists return an array consisting of element -1.
     * 
     * @param arr
     * @param n
     * @param k
     * @return
     */
    public static List<Integer> subarraySumEqualK(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        int left = 0;
        int sum = 0;

        for (int right = 0; right < arr.length; right++) {

            sum += arr[right];

            while (sum > k && left < right) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                result.add(left + 1);
                result.add(right + 1);
                return result;
            }
        }
        result.add(-1);
        return result;
    }

    /**
     * The largest sum of k consecutive elements
     * @param nums
     * @param k
     * @return
     */
    public int maxSumOfKContiguousElements(int[] nums, int k) {
        int left = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            if (right - left + 1 == k) {
                max = Math.max(max, sum);
                sum -= nums[left];
                left++;
            }

        }
        return max;
    }

     
    /**
     * Given a string and an integer k, 
     * find the length of the longest substring that contains at most k distinct characters.
     * Example: s = "araaci" and k = 2 => longestString = "araa", length =4
     */
    public int longestSubstringContainsAtMostK(String s, int k) {
        if (s == null || s.isEmpty() || k == 0)
            return 0;

        int left = 0;
        int maxLength = 0;
        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            charFrequencyMap.put(rightChar, charFrequencyMap.getOrDefault(rightChar, 0) + 1);

            // Shrink the window until we have at most k distinct characters
            while (charFrequencyMap.size() > k) {
                char leftChar = s.charAt(left);
                charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) - 1);
                if (charFrequencyMap.get(leftChar) == 0) {
                    charFrequencyMap.remove(leftChar);
                }
                left++; // shrink the window
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

}
