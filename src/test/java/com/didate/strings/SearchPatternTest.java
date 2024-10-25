package com.didate.strings;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class SearchPatternTest {

    private String text;
    private String pattern;
    private List<Integer> expected;

    public SearchPatternTest(String text, String pattern, List<Integer> expected) {
        this.text = text;
        this.pattern = pattern;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][]{
            {"abcabcabc", "abc", Arrays.asList(0, 3, 6)},   
            {"hello world", "world", Arrays.asList(6)},
            {"aaaaaa", "aa", Arrays.asList(0, 1, 2, 3, 4)},           
            {"mississippi", "iss", Arrays.asList(1, 4)},              
            {"abcdef", "def", Arrays.asList(3)}, 
            {"abc", "abcd", new ArrayList<>()},
            {"abcdef", "xyz", new ArrayList<>()},
            {"abcABCabc", "ABC", Arrays.asList(3)}                 
        });
    }

    

    @Test
    public void testNaiveSearch() {
        SearchPattern searchPattern = new SearchPattern();
        List<Integer> result = searchPattern.naiveSearch(text, pattern);
        assertEquals(expected, result);
    }

    @Test
    public void testSearch() {
        SearchPattern searchPattern = new SearchPattern();
        List<Integer> result = searchPattern.search(text, pattern);
        assertEquals(expected, result);
    }

    @Test
    public void testRabinKarpearch() {
        SearchPattern searchPattern = new SearchPattern();
        List<Integer> result = searchPattern.rabinKarp(text, pattern);
        assertEquals(expected, result);
    }
}
