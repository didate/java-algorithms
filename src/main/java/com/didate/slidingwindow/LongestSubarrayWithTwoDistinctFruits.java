package com.didate.slidingwindow;

import java.util.HashMap;

public class LongestSubarrayWithTwoDistinctFruits {
    
    /**
     * Given an array representing fruits in a row, where each element is a character representing a type of fruit, 
     * find the length of the longest subarray with at most 2 distinct types of fruits.
     * Example:
     *      Input: fruits = ['A', 'B', 'C', 'A', 'C']
     *      Output: 3 (subarray ['C', 'A', 'C'])
     */
    public static int longestSubarrayWithTwoDistinctFruits(char[] fruits) {
        int windowLeft =0;
        HashMap<Character, Integer> charMap = new HashMap<>();
        int windowLength = 0;
        for (int windowRight = 0; windowRight < fruits.length; windowRight++) {
            char fruit = fruits[windowRight];
            charMap.put(fruit, charMap.getOrDefault(fruit, 0)+1);
            
            while (charMap.size() > 2) {
                fruit = fruits[windowLeft];
                charMap.put(fruit, charMap.getOrDefault(fruit, 0)-1);
                if(charMap.get(fruit)==0){
                    charMap.remove(fruit);
                }
                windowLeft++;
            }
            windowLength = Math.max(windowLength, windowRight - windowLeft +1);
        }
        return windowLength;
    }
}
