package com.didate.strings;
import java.util.ArrayList;
import java.util.List;

/**
 * Given a pattern and a text, we need to print all occurrences (indexes) of the pattern in the text
 */
public class SearchPattern {
    

    public List<Integer> naiveSearch(String text, String pattern){
        List<Integer> indexes = new ArrayList<>();
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n-m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if(pattern.charAt(j)!=text.charAt(i+j)){
                    break;
                }
            }
            if(j == m){
                indexes.add(i);
            }
        }

        return indexes;
    }

    
}
