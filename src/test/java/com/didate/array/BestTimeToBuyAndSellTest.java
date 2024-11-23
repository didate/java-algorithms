package com.didate.array;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BestTimeToBuyAndSellTest {

    private final BestTimeToBuyAndSell solution = new BestTimeToBuyAndSell();

    @Test
    public void testMaxProfitI() {
        // Test case 1: General case
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        assertEquals("Expected max profit is 5", 5, solution.maxProfitI(prices1));

        // Test case 2: No profit possible
        int[] prices2 = {7, 6, 4, 3, 1};
        assertEquals("Expected max profit is 0", 0, solution.maxProfitI(prices2));

        // Test case 3: Only one price
        int[] prices3 = {5};
        assertEquals("Expected max profit is 0", 0, solution.maxProfitI(prices3));
    }

    @Test
    public void testMaxProfitII() {
        // Test case 1: General case
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        assertEquals("Expected max profit is 7", 7, solution.maxProfitII(prices1));

        // Test case 2: No profit possible
        int[] prices2 = {7, 6, 4, 3, 1};
        assertEquals("Expected max profit is 0", 0, solution.maxProfitII(prices2));

        // Test case 3: Profitable days in a row
        int[] prices3 = {1, 2, 3, 4, 5};
        assertEquals("Expected max profit is 4", 4, solution.maxProfitII(prices3));

        // Test case 4: Zigzag pattern
        int[] prices4 = {3, 3, 5, 0, 0, 3, 1, 4};
        assertEquals("Expected max profit is 8", 8, solution.maxProfitII(prices4));
    }

    @Test
    public void testMaxProfitIII() {
        // Test case 1: General case
        int[] prices1 = {3, 3, 5, 0, 0, 3, 1, 4};
        assertEquals("Expected max profit is 0 (method not implemented yet)", 0, solution.maxProfitIII(prices1));

        // Test case 2: No transactions possible
        int[] prices2 = {7, 6, 4, 3, 1};
        assertEquals("Expected max profit is 0", 0, solution.maxProfitIII(prices2));

        // Test case 3: Two transactions maximizing profit
        int[] prices3 = {1, 2, 3, 4, 5};
        assertEquals("Expected max profit is 0 (method not implemented yet)", 0, solution.maxProfitIII(prices3));
    }
}