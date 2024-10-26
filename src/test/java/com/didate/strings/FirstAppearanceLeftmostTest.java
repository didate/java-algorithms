package com.didate.strings;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FirstAppearanceLeftmostTest {

    private final String inputString;
    private final int expectedIndex;

    
    public FirstAppearanceLeftmostTest(String inputString, int expectedIndex) {
        this.inputString = inputString;
        this.expectedIndex = expectedIndex;
    }

    
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            
            {"geeg", 0},         
            {"hello", 2},        
            {"swiss", 0},        
            {"programming", 1},  
            {"abcdefg", -1},     
            {"xyz", -1},         
            {"a", -1},           
            {"aaaaaa", 0},       
            {"", -1} 
        });
    }

    
    @Test
    public void testRepeatedCharacter() {
        assertEquals(expectedIndex, FirstAppearanceLeftmost.repeatedCharacter(inputString));
    }
}
