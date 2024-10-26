package com.didate.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Given a string s consisting of lowercase Latin Letters. 
 * Return the first non-repeating character in s. If there is no non-repeating character, return '$'.
 */
public class FirstNonRepeatingCharacter {

    public static char firstNonRepeatingCharacter(String s) {
        LinkedHashMap<Character, Integer> charCountMap = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character currentChar = s.charAt(i);
            charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);
        }

        for (Map.Entry<Character, Integer> v : charCountMap.entrySet()) {
            if (charCountMap.get(v.getKey()) == 1) {
                return v.getKey();
            }
        }
        return '$';
    }

    public static char firstNonRepeatingCharacter2(String s) {

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                return c;
            }
        }

        return '$';
    }
}
