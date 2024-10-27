package com.didate.strings;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class ReverseWordTest {

    private final String input;
    private final String expectedOutput;

    public ReverseWordTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    
    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][] {
            { "hello.world", "world.hello" },
            { "java.is.fun", "fun.is.java" },
            { "one.word", "word.one" },
            { "a.b.c.d", "d.c.b.a" },
            { "singleword", "singleword" },
            
        });
    }

    
    @Test
    public void testReverseWords() {
        assertEquals(expectedOutput, ReverseWord.reverseWords(input));
    }

    
}