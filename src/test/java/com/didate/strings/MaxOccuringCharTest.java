package com.didate.strings;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MaxOccuringCharTest {
    
    private String input;
    private char expectedOutput;

    public MaxOccuringCharTest(String input, char expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][] {
            { "hello", 'l' },
            { "test", 't' },
            { "aabbcc", 'a' },
            { "abcdefg", 'a' },
            { "mississippi", 'i' },
            { "character", 'a' }
        });
    }

    @Test
    public void testGetMaxOccurringChar() {
        assertEquals(expectedOutput, MaxOccuringChar.getMaxOccuringChar(input));
    }
}
