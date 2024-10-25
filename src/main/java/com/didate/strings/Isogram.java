package com.didate.strings;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string S of alphabets, 
 * check if it is isogram or not. 
 * An Isogram is a string in which no letter occurs more than once.
 */
public class Isogram {
    

    static boolean isIsogram(String data){
        Set<Character> iso = new HashSet<>();

        if(data.equals("")) return true;

        data = data.toLowerCase();
        
        for(int i=0; i<data.length(); i++){
            iso.add(data.charAt(i));
        }
        
        return iso.size() == data.length();
    }
}
