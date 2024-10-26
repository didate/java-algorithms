package com.didate.strings;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FirstNonRepeatingCharacterTest {
    

    @Test
    public void testFirstNonRepeatingCharacter() {
        assertEquals('f', FirstNonRepeatingCharacter.firstNonRepeatingCharacter("geeksforgeeks"));
        assertEquals('$', FirstNonRepeatingCharacter.firstNonRepeatingCharacter("aabbcc"));
        assertEquals('c', FirstNonRepeatingCharacter.firstNonRepeatingCharacter("abacabad"));
        assertEquals('a', FirstNonRepeatingCharacter.firstNonRepeatingCharacter("abcd"));
        assertEquals('$', FirstNonRepeatingCharacter.firstNonRepeatingCharacter("")); 
        assertEquals('u', FirstNonRepeatingCharacter.firstNonRepeatingCharacter("success"));
        assertEquals('v', FirstNonRepeatingCharacter.firstNonRepeatingCharacter("level")); 
        assertEquals('$', FirstNonRepeatingCharacter.firstNonRepeatingCharacter("noon")); 
    }

    @Test
    public void testFirstNonRepeatingCharacter2() {
        assertEquals('f', FirstNonRepeatingCharacter.firstNonRepeatingCharacter2("geeksforgeeks"));
        assertEquals('$', FirstNonRepeatingCharacter.firstNonRepeatingCharacter2("aabbcc"));
        assertEquals('c', FirstNonRepeatingCharacter.firstNonRepeatingCharacter2("abacabad"));
        assertEquals('a', FirstNonRepeatingCharacter.firstNonRepeatingCharacter2("abcd"));
        assertEquals('$', FirstNonRepeatingCharacter.firstNonRepeatingCharacter2("")); 
        assertEquals('u', FirstNonRepeatingCharacter.firstNonRepeatingCharacter2("success"));
        assertEquals('v', FirstNonRepeatingCharacter.firstNonRepeatingCharacter2("level")); 
        assertEquals('$', FirstNonRepeatingCharacter.firstNonRepeatingCharacter2("noon")); 
    }
}
