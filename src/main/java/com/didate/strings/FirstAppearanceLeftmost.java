package com.didate.strings;

import java.util.LinkedHashMap;

/**
 * You are given a string S (both uppercase and lowercase characters). 
 * You need to print the index of repeated character whose first appearance is leftmost
 * S = geeks
 * Output: 0
 */
public class FirstAppearanceLeftmost {

    static int repeatedCharacter(String S) {
        LinkedHashMap<Character, Integer[]> repeat = new LinkedHashMap<>();

        for (int i = 0; i < S.length(); i++) {
            Character currentChar = S.charAt(i);
            Integer[] currentValue = repeat.get(currentChar);

            if (currentValue == null) {
                repeat.put(currentChar, new Integer[] { 1, i });
            } else {
                currentValue[0]++;
                repeat.put(currentChar, currentValue);
            }
        }

        for (Integer[] value : repeat.values()) {
            if (value[0] > 1)
                return value[1];
        }
        return -1;
    }

    static int repeatedCharacter2(String S) {
        LinkedHashMap<Character, Integer> charactersMap = new LinkedHashMap<>();
        int index = Integer.MAX_VALUE;

        for (int i = 0; i < S.length(); i++) {
            Character currentChar = S.charAt(i);

            if(charactersMap.containsKey(currentChar)){
                index = Math.min(index, charactersMap.get(currentChar));
            }else{
                charactersMap.put(currentChar, i);
            }
        }


        return index == Integer.MAX_VALUE ? -1 : index;
    }
}
