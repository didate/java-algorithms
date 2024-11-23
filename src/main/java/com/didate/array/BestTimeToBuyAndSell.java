package com.didate.array;

public class BestTimeToBuyAndSell {
    

    /**
     * You are given an array prices where prices[i] is the price of a given stock on the ith day.
     * You want to maximize your profit by choosing a single day to buy one stock and choosing a different d
     * ay in the future to sell that stock.
     * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
     * @param prices
     * @return
     */
    public int maxProfitI(int[] prices) {
        int maxProfit = 0;
        int buyPrice = prices[0];
       
        for(int i=1; i<prices.length; i++){
            if(prices[i] < buyPrice){
                buyPrice = prices[i];
            }else{
                 int currProfit = prices[i] - buyPrice;
                 maxProfit = Math.max(currProfit, maxProfit); 
            }
        }
        return maxProfit;
    }

    /**
     * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
     * On each day, you may decide to buy and/or sell the stock. 
     * You can only hold at most one share of the stock at any time. 
     * However, you can buy it then immediately sell it on the same day.
     * Find and return the maximum profit you can achieve.
     * @param prices
     * @return
     */
    public int maxProfitII(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }

    /**
     * You are given an array prices where prices[i] is the price of a given stock on the ith day.
     * Find the maximum profit you can achieve. You may complete at most two transactions.
     * Note: You may not engage in multiple transactions simultaneously 
     * (i.e., you must sell the stock before you buy again).
     * @param prices
     * @return
     */
    public int maxProfitIII(int[] prices) {
        return 0;
    }
}
