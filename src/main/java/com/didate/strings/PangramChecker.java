package com.didate.strings;

import java.util.HashMap;

/**
 * Given a string s check if it is "Panagram" or not.
 * A "Panagram" is a sentence containing every letter in the English Alphabet.
 */
public class PangramChecker {
    

    public static boolean checkPangram  (String s) {
        HashMap<Character, Integer> count = new HashMap<>();
        s=s.toUpperCase();
        
        for(int i=65; i<= 90; i++){
            count.put((char)i,0);
        }
   
        for(char c : s.toCharArray()){
            if(count.containsKey(c))
                count.put(c, count.get(c)+1);
        }
        
        for(int v : count.values()){
            if(v ==0) return false;
        }
        return true;
    }

    public static boolean checkPangram2(String s) {
        
        boolean[] present = new boolean[26];
        int index = 0;
        s = s.toUpperCase();
        
        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                index = c - 'A'; 
                present[index] = true; 
            }
        }
        
        for (boolean b : present) {
            if (!b) return false; 
        }
        return true; 
    }
}
