package com.didate;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestSubstringKDistinctTest {
    

    @Test
    public void testLongestSubstringWithKDistinctCharacters() {
        SlidingWindows slidingWindows = new SlidingWindows();

        assertEquals(4, slidingWindows.longestSubstringContainsAtMostK("araaci", 2));
        assertEquals(2, slidingWindows.longestSubstringContainsAtMostK("araaci", 1));
        assertEquals(5, slidingWindows.longestSubstringContainsAtMostK("cbbebi", 3));
        assertEquals(6, slidingWindows.longestSubstringContainsAtMostK("aaabbb", 2));
        assertEquals(3, slidingWindows.longestSubstringContainsAtMostK("eceba", 2));
        assertEquals(3, slidingWindows.longestSubstringContainsAtMostK("abcd", 3));
        assertEquals(4, slidingWindows.longestSubstringContainsAtMostK("abaccc", 2));
        assertEquals(1, slidingWindows.longestSubstringContainsAtMostK("a", 2));
        assertEquals(7, slidingWindows.longestSubstringContainsAtMostK("aabacbebebe", 3));
        assertEquals(11, slidingWindows.longestSubstringContainsAtMostK("abcadcacacaca", 3));
    }

    @Test
    public void testEdgeCases() {
        SlidingWindows slidingWindows = new SlidingWindows();
        assertEquals(0, slidingWindows.longestSubstringContainsAtMostK("", 2));
        assertEquals(0, slidingWindows.longestSubstringContainsAtMostK("a", 0));
        assertEquals(1, slidingWindows.longestSubstringContainsAtMostK("a", 1));
    }
}
