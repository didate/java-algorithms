package com.didate.slidingwindow;

import java.util.HashMap;

public class LongestSubstringKDistinct {
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
