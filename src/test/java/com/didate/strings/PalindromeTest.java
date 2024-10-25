package com.didate.strings;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PalindromeTest {

    private final String input;
    private final boolean expected;

    public PalindromeTest(String input, boolean expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][]{
                {"abba", true},           
                {"racecar", true},        
                {"a", true},              
                {"", true},               
                {"abcd", false},          
                {"hello", false},         
                {"Aba", false}            
        });
    }

    @Test
    public void testPalindrome() {
        assertEquals(expected, Palindrome.check(input));
    }
}
