package com.didate.strings;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IsogramTest {

    private final String input;
    private final boolean expected;

    public IsogramTest(String input, boolean expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][]{
                {"isogram", true},         
                {"hello", false},          
                {"abcdefg", true},         
                {"a", true},               
                {"", true},                
                {"moOse", false},          
                {"Dermatoglyphics", true}  
        });
    }

    @Test
    public void testIsogram() {
        assertEquals(expected, Isogram.isIsogram(input));
    }
}