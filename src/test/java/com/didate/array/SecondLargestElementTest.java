package com.didate.array;

import org.junit.Test;
import static org.junit.Assert.*;

public class SecondLargestElementTest {

    @Test
    public void testFindSecondLargest_NormalCase() {
        SecondLargestElement finder = new SecondLargestElement();
        int[] arr = {10, 20, 4, 45, 99};
        assertEquals(45, finder.findSecondLargest(arr));
    }

    @Test
    public void testFindSecondLargest_NegativeNumbers() {
        SecondLargestElement finder = new SecondLargestElement();
        int[] arr = {-10, -20, -4, -45, -99};
        assertEquals(-10, finder.findSecondLargest(arr));
    }

    @Test
    public void testFindSecondLargest_LargeArray() {
        SecondLargestElement finder = new SecondLargestElement();
        int[] arr = {1000, 999, 998, 997, 996, 995};
        assertEquals(999, finder.findSecondLargest(arr));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindSecondLargest_InsufficientElements() {
        SecondLargestElement finder = new SecondLargestElement();
        int[] arr = {10};
        finder.findSecondLargest(arr); // Should throw exception
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindSecondLargest_AllIdenticalElements() {
        SecondLargestElement finder = new SecondLargestElement();
        int[] arr = {5, 5, 5};
        finder.findSecondLargest(arr); // Should throw exception
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindSecondLargest_NullArray() {
        SecondLargestElement finder = new SecondLargestElement();
        finder.findSecondLargest(null); // Should throw exception
    }
}