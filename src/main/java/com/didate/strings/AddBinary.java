package com.didate.strings;

public class AddBinary {
    
    public String add(String s1, String s2) {
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;
        StringBuilder res = new StringBuilder();
    
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
    
            if (i >= 0) {
                sum += s1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += s2.charAt(j) - '0';
                j--;
            }
    
            res.append(sum % 2); 
            carry = sum / 2;     
        }
    
        
        res.reverse();
    
        
        while (res.length() > 0 && res.charAt(0) == '0') {
            res.deleteCharAt(0);
        }
    
        return res.toString();
    }
}
