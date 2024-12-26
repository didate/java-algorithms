package com.didate.strings;

/**
 * You are given two strings of equal lengths, s1 and s2. 
 * The task is to check if s2 is a rotated version of the string s1.
 */
public class RotatedString {
    
    public static boolean areRotations(String s1, String s2) {
        String str=s1+s1;
        
        return str.contains(s2);
    }
}
