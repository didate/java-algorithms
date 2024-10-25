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

    /**
     * Exemple : text = ABAABC  ABADAB, pattern = ABA
     * Result = (0,6)
     * Time complexity : O(n)
     * @param text
     * @param pattern
     * @return
     * 
     */
    public List<Integer> search(String text, String pattern){
        List<Integer> indexes = new ArrayList<>();
        int patternLength = pattern.length();

        if(patternLength > text.length()){
            return indexes;
        }

        for(int i=0; i<=text.length() - patternLength; i++){
            if(text.substring(i, i + patternLength).equals(pattern)){
                indexes.add(i);
            }
        }

        return indexes;
    }
}
