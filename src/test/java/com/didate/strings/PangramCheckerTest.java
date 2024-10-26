package com.didate.strings;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PangramCheckerTest {

    
    @Parameterized.Parameter(0)
    public String input; 
    
    @Parameterized.Parameter(1)
    public boolean expected; 

    
    @Parameterized.Parameters(name = "{index}: checkPangram({0}) = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"The quick brown fox jumps over a lazy dog", true},
            {"Pack my box with five dozen liquor jugs", true},
            {"Sphinx of black quartz, judge my vow", true},
            {"Cwm fjord bank glyphs vext quiz", true},
            {"Hello World", false},
            {"A quick brown fox", false},
            {"Just a sample sentence", false},
            {"This sentence is missing some letters", false},
            {"", false}, 
            {"A", false}, 
            {"!@#$%^&*()_+|~` The quick brown fox jumps over a lazy dog", true} 
        });
    }

    @Test
    public void testCheckPangram() {
        assertEquals(expected, PangramChecker.checkPangram(input));
    }

    @Test
    public void testCheckPangram2() {
        assertEquals(expected, PangramChecker.checkPangram2(input));
    }
}
