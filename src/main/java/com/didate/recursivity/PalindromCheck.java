package com.didate.recursivity;


/**
 * Palindromes are sequences of characters that read the same forwards and backwards
 * Example : ABCCBA
 */
public class PalindromCheck {
 
     
    public static boolean check(String str, int start, int end){

        if (start >= end){
            return true;
        }else{
            return  str.charAt(start) == str.charAt(end)  && check(str, ++start, --end);
        }
    }
}
