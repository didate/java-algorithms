package com.didate.strings;

import java.util.LinkedHashMap;

public class FirstAppearanceLeftmost {
    
     static int repeatedCharacter(String S)
    {
        LinkedHashMap<Character, Integer[]> repeat = new LinkedHashMap<>();
        
        for(int i=0; i<S.length(); i++){
            Character currentChar = S.charAt(i);
            Integer[] currentValue = repeat.get(currentChar);
            
            if(currentValue==null){
                repeat.put(currentChar, new Integer[]{1, i});
            }else{
                currentValue[0]++;
                repeat.put(currentChar, currentValue);
            }
        }

        for(Integer[] value : repeat.values()){
            if(value[0]>1) return value[1];
        }
        return -1;
    }
}
