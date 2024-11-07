package com.didate.recursivity;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PalindromCheckTest {
    
    private final String input;
    private final boolean expected;

    public PalindromCheckTest(String input, boolean expected) {
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
                {"aba", true}            
        });
    }

    @Test
    public void testPalindrome() {
        assertEquals(expected,  PalindromCheck.check(input, 0, input.length()-1));
    }
}
