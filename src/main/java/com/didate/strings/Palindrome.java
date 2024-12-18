package com.didate.strings;


/**
 * Palindromes are sequences of characters that read the same forwards and backwards
 * Example : ABCCBA
 */
public class Palindrome {
    
    public static boolean check(String str){

        int left =0; 
        int right = str.length()-1;

        while (left < right) {
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
