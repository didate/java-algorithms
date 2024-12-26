package com.didate.array;

import static org.junit.Assert.*;
import org.junit.Test;

public class EquilibriumPointFinderTest {

    @Test
    public void testEquilibriumPointExists() {
        int[] arr = {1, 3, 5, 2, 2};
        assertEquals(3, EquilibriumPointFinder.findEquilibriumPoint(arr));
    }

    @Test
    public void testSingleElementArray() {
        int[] arr = {1};
        assertEquals(1, EquilibriumPointFinder.findEquilibriumPoint(arr)); // The only element is the equilibrium point
    }

    @Test
    public void testNoEquilibriumPoint() {
        int[] arr = {1, 2, 3};
        assertEquals(-1, EquilibriumPointFinder.findEquilibriumPoint(arr)); // No equilibrium point exists
    }

    @Test
    public void testAllZeros() {
        int[] arr = {0, 0, 0, 0};
        assertEquals(1, EquilibriumPointFinder.findEquilibriumPoint(arr)); // Any index is valid, here we return the first
    }

    @Test
    public void testEquilibriumAtEnd() {
        int[] arr = {2, 4, 2};
        assertEquals(2, EquilibriumPointFinder.findEquilibriumPoint(arr)); // No equilibrium since it's sorted
    }

    @Test
    public void testLargeInput() {
        int[] arr = {10, 5, 3, 0, 3, 5, 10};
        assertEquals(4, EquilibriumPointFinder.findEquilibriumPoint(arr));
    }

    @Test
    public void testNegativeNumbers() {
        int[] arr = {2, -1, 3, 0, 3, -1, 2};
        assertEquals(4, EquilibriumPointFinder.findEquilibriumPoint(arr));
    }
}