package com.didate.strings;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddBinaryTest {
    @Test
    public void testSimpleAddition() {
        // Both strings are of equal length
        assertEquals("10101", new AddBinary().add("1010", "1011"));
    }

    @Test
    public void testUnequalLengths() {
        // Strings with unequal lengths
        assertEquals("1000", new AddBinary().add("110", "10"));
    }

    @Test
    public void testCarryOver() {
        // Significant carry-over cases
        assertEquals("11110", new AddBinary().add("1111", "1111"));
    }

    @Test
    public void testAllZeros() {
        // Both strings are zero
        assertEquals("", new AddBinary().add("0", "0"));
    }

    @Test
    public void testLeadingZeros() {
        // Strings with leading zeros
        assertEquals("111", new AddBinary().add("000101", "0010"));
    }

    @Test
    public void testOneEmptyString() {
        // One string is empty
        assertEquals("1010", new AddBinary().add("1010", ""));
    }

    @Test
    public void testBothEmptyStrings() {
        // Both strings are empty
        assertEquals("", new AddBinary().add("", ""));
    }

    @Test
    public void testSingleDigitNoCarry() {
        // Single digits without carry
        assertEquals("1", new AddBinary().add("1", "0"));
    }

    @Test
    public void testSingleDigitWithCarry() {
        // Single digits with carry
        assertEquals("10", new AddBinary().add("1", "1"));
    }

    @Test
    public void testLongStrings() {
        // Large binary strings
        String s1 = "111011101110111011101110111011101110111011101110111011101110";
        String s2 = "101010101010101010101010101010101010101010101010101010101010";
        assertEquals(
            "1101100011011101100011011101100011011101100011011101100011000",
            new AddBinary().add(s1, s2)
        );
    }
}
