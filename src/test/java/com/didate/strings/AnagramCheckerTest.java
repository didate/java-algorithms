package com.didate.strings;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AnagramCheckerTest {
    
    @Test
    public void testAreAnagrams_True() {
        assertTrue(AnagramChecker.areAnagrams("listen", "silent"));
        assertTrue(AnagramChecker.areAnagrams("anagram", "nagaram"));
        assertTrue(AnagramChecker.areAnagrams("triangle", "integral")); 
        assertTrue(AnagramChecker.areAnagrams("12345", "54321")); 
        assertTrue(AnagramChecker.areAnagrams("!@#$%", "%$#@!")); 
    }

    @Test
    public void testAreAnagrams_False() {
        assertFalse(AnagramChecker.areAnagrams("hello", "world"));
        assertFalse(AnagramChecker.areAnagrams("abc", "abcd"));
        assertFalse(AnagramChecker.areAnagrams("aaa", "aa")); 
        assertFalse(AnagramChecker.areAnagrams("abc", "cba!")); 
    }

    @Test
    public void testAreAnagrams_EmptyStrings() {
        assertTrue(AnagramChecker.areAnagrams("", ""));
    }
}
