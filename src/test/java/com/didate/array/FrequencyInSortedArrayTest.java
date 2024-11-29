package com.didate.array;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FrequencyInSortedArrayTest {
    
    @Test
    public void testFindFrequency() {
        FrequencyInSortedArray frequencyFinder = new FrequencyInSortedArray();

        int[] arr1 = {1, 1, 2, 2, 2, 3};
        List<Integer> expected1 = Arrays.asList(2, 3, 1); 
        assertEquals(expected1, frequencyFinder.findFrequency(arr1));

        int[] arr2 = {4, 4, 4, 4};
        List<Integer> expected2 = Arrays.asList(4); 
        assertEquals(expected2, frequencyFinder.findFrequency(arr2));

        int[] arr3 = {5};
        List<Integer> expected3 = Arrays.asList(1); 
        assertEquals(expected3, frequencyFinder.findFrequency(arr3));

        int[] arr4 = {1, 2, 3, 4};
        List<Integer> expected4 = Arrays.asList(1, 1, 1, 1); 
        assertEquals(expected4, frequencyFinder.findFrequency(arr4));
    }
}
