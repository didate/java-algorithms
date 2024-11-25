package com.didate.array;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LeadersInArrayTest {

    @Test
    public void testLeadersInArray_AllLeaders() {
        LeadersInArray solution = new LeadersInArray();
        int[] arr = {5, 4, 3, 2, 1};
        List<Integer> expected = List.of(5, 4, 3, 2, 1);
        assertEquals(expected, solution.findLeaders(arr));
    }

    @Test
    public void testLeadersInArray_SingleLeader() {
        LeadersInArray solution = new LeadersInArray();
        int[] arr = {1, 2, 3, 4, 0};
        List<Integer> expected = List.of(4, 0);
        assertEquals(expected, solution.findLeaders(arr));
    }

    @Test
    public void testLeadersInArray_MultipleLeaders() {
        LeadersInArray solution = new LeadersInArray();
        int[] arr = {16, 17, 4, 3, 5, 2};
        List<Integer> expected = List.of(17, 5, 2);
        assertEquals(expected, solution.findLeaders(arr));
    }

    @Test
    public void testLeadersInArray_AllSameElements() {
        LeadersInArray solution = new LeadersInArray();
        int[] arr = {3, 3, 3, 3};
        List<Integer> expected = List.of(3, 3, 3, 3);
        assertEquals(expected, solution.findLeaders(arr));
    }

    @Test
    public void testLeadersInArray_SingleElement() {
        LeadersInArray solution = new LeadersInArray();
        int[] arr = {42};
        List<Integer> expected = List.of(42);
        assertEquals(expected, solution.findLeaders(arr));
    }
}
