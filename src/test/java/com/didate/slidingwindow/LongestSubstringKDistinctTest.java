package com.didate.slidingwindow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.didate.slidingwindow.LongestSubstringKDistinct;

public class LongestSubstringKDistinctTest {
    

    @Test
    public void testLongestSubstringWithKDistinctCharacters() {
        LongestSubstringKDistinct kDistinct = new LongestSubstringKDistinct();

        assertEquals(4, kDistinct.longestSubstringContainsAtMostK("araaci", 2));
        assertEquals(2, kDistinct.longestSubstringContainsAtMostK("araaci", 1));
        assertEquals(5, kDistinct.longestSubstringContainsAtMostK("cbbebi", 3));
        assertEquals(6, kDistinct.longestSubstringContainsAtMostK("aaabbb", 2));
        assertEquals(3, kDistinct.longestSubstringContainsAtMostK("eceba", 2));
        assertEquals(3, kDistinct.longestSubstringContainsAtMostK("abcd", 3));
        assertEquals(4, kDistinct.longestSubstringContainsAtMostK("abaccc", 2));
        assertEquals(1, kDistinct.longestSubstringContainsAtMostK("a", 2));
        assertEquals(7, kDistinct.longestSubstringContainsAtMostK("aabacbebebe", 3));
        assertEquals(11, kDistinct.longestSubstringContainsAtMostK("abcadcacacaca", 3));
    }

    @Test
    public void testEdgeCases() {
        LongestSubstringKDistinct kDistinct = new LongestSubstringKDistinct();
        assertEquals(0, kDistinct.longestSubstringContainsAtMostK("", 2));
        assertEquals(0, kDistinct.longestSubstringContainsAtMostK("a", 0));
        assertEquals(1, kDistinct.longestSubstringContainsAtMostK("a", 1));
    }
}
