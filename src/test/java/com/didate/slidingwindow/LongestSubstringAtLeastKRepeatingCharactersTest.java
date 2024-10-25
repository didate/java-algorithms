package com.didate.slidingwindow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestSubstringAtLeastKRepeatingCharactersTest {

    @Test
    public void testLongestSubstringAtLeastKRepeatingCharacters() {
        assertEquals(3, LongestSubstringAtLeastKRepeatingCharacters.longestSubstring("aaabb", 3));

        assertEquals(6, LongestSubstringAtLeastKRepeatingCharacters.longestSubstring("aaabbb", 3));

        assertEquals(0, LongestSubstringAtLeastKRepeatingCharacters.longestSubstring("abcde", 2));

        assertEquals(5, LongestSubstringAtLeastKRepeatingCharacters.longestSubstring("aaaaa", 1));

        assertEquals(5, LongestSubstringAtLeastKRepeatingCharacters.longestSubstring("ababbcdeed", 2));

        assertEquals(4, LongestSubstringAtLeastKRepeatingCharacters.longestSubstring("ababbc", 2));

        assertEquals(9, LongestSubstringAtLeastKRepeatingCharacters.longestSubstring("aabbbccddeeefff", 2));

        assertEquals(0, LongestSubstringAtLeastKRepeatingCharacters.longestSubstring("", 2));

        assertEquals(8, LongestSubstringAtLeastKRepeatingCharacters.longestSubstring("aabbccdd", 1));

        assertEquals(0, LongestSubstringAtLeastKRepeatingCharacters.longestSubstring("aabbcc", 3));
    }
}
