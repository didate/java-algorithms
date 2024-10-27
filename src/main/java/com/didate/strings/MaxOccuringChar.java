package com.didate.strings;

import java.util.HashMap;
import java.util.Map;
/**
 * Given a string str of lowercase alphabets. The task is to find the maximum occurring character in the string str. 
 * If more than one character occurs the maximum number of time then print the lexicographically smaller character.
 */
public class MaxOccuringChar {
    
    public static char getMaxOccuringChar(String line)
    {
        Map<Character, Integer> occurs = new HashMap<>();
        
        for(char occ : line.toCharArray()){
            occurs.put(occ, occurs.getOrDefault(occ, 0)+1);
        }
        
        Character result = line.charAt(0);
        int maxOcc= 1;
        
        for(Map.Entry<Character, Integer> occ : occurs.entrySet()){
            
            if(occ.getValue() == maxOcc){
                result = occ.getKey() < result ? occ.getKey() : result;
            }else if(occ.getValue() > maxOcc){
                maxOcc = occ.getValue();
                result = occ.getKey();
            }
        }
        return result;
    }
}
