package com.didate.strings;


/**
 * Given a String str, reverse the string without reversing its individual words. 
 * Words are separated by dots.
 * Note: The last character has not been '.'. 
 */
public class ReverseWord {
    

    public static String reverseWords(String str) {
        StringBuilder result = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();
        int right = str.length() - 1;
    
        while (right >= 0) {
            char currentChar = str.charAt(right);
            
            if (currentChar != '.') {
                currentWord.insert(0, currentChar);
            } else {
                result.append(currentWord).append('.');
                currentWord.setLength(0); 
            }
            right--;
        }

        result.append(currentWord);
        return result.toString();
    }
}
