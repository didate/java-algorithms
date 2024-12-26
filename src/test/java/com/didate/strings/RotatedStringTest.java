package com.didate.strings;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RotatedStringTest {
     @Test
    public void testValidRotation() {
        String s1 = "abcde";
        String s2 = "deabc";
        assertTrue(RotatedString.areRotations(s1, s2));  // s2 is a rotated version of s1
    }

    @Test
    public void testInvalidRotation() {
        String s1 = "abcde";
        String s2 = "abced";
        assertFalse(RotatedString.areRotations(s1, s2));  // s2 is not a rotated version of s1
    }

    @Test
    public void testEmptyStrings() {
        String s1 = "";
        String s2 = "";
        assertTrue(RotatedString.areRotations(s1, s2));  // Both empty strings are considered rotations
    }

    @Test
    public void testSingleCharacterStrings() {
        String s1 = "a";
        String s2 = "a";
        assertTrue(RotatedString.areRotations(s1, s2));  // Single character strings are trivially rotations
    }

    @Test
    public void testDifferentLengths() {
        String s1 = "abc";
        String s2 = "abcd";
        assertFalse(RotatedString.areRotations(s1, s2));  // Different length strings can't be rotations
    }

    @Test
    public void testRotationWithRepetitions() {
        String s1 = "abab";
        String s2 = "baba";
        assertTrue(RotatedString.areRotations(s1, s2));  // s2 is a rotated version of s1 with repeated characters
    }
    
    @Test
    public void testRotationWithSpecialCharacters() {
        String s1 = "abc@!";
        String s2 = "@!abc";
        assertTrue(RotatedString.areRotations(s1, s2));  // s2 is a rotated version of s1 with special characters
    }
    
    @Test
    public void testNoRotation() {
        String s1 = "xyz";
        String s2 = "zyx";
        assertFalse(RotatedString.areRotations(s1, s2));  // s2 is not a rotated version of s1
    }

}
