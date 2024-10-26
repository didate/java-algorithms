package com.didate.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s1 and s2 consisting of lowercase characters. 
 * The task is to check whether two given strings are an anagram of each other or not. 
 * An anagram of a string is another string that contains the same characters, 
 * only the order of characters can be different. For example, act and tac are an anagram of each other. 
 * Strings s1 and s2 can only contain lowercase alphabets
 */
public class AnagramChecker {
    
    public static boolean areAnagrams(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        Map<Character, Integer> count = new HashMap<>();
        
        for(int i=0; i<s1.length(); i++){
            count.put(s1.charAt(i), count.getOrDefault(s1.charAt(i),0)+1);
            count.put(s2.charAt(i), count.getOrDefault(s2.charAt(i),0)-1);
        }
        
        for(Integer v : count.values()){
            if(v != 0) return false;
        }
        return true;
    }
}
