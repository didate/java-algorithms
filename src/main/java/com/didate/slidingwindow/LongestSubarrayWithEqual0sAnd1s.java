package com.didate.slidingwindow;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class LongestSubarrayWithEqual0sAnd1s {
    
    /**
     * Given a binary array, find the length of the longest contiguous subarray with an equal number of 0s and 1s
     * Example:
     *      Input: arr = [0, 1, 0, 1, 0, 1]
     *      Output: 6 (subarray [0, 1, 0, 1, 0, 1])
     * @param nums
     * @return
     */
    public static int findMaxLength(int[]nums){
        //int[] nums3 = {0, 0, 1, 0, 1, 1, 0};
        //assertEquals(6, LongestSubarrayWithEqual0sAnd1s.findMaxLength(nums3));
        // int[] nums4 = {1, 1, 1, 0, 0, 1, 0, 1};

        int windowLength =0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 0);

        for (int i = 0; i < nums.length; i++) {
            
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);

            if (Objects.equals(map.get(1), map.get(0))) {
                windowLength = Math.max(windowLength, map.get(1) + map.get(0));
            }
            
        }
        return windowLength;
    }
}
