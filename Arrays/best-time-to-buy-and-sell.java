// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    public int maxProfit(int[] prices) {
        
        int price = prices[0];
        int profit = 0;
        
        for (int i=1; i< prices.length; i++) {
            
            // check if the price on the current day is less
            if (prices[i] < price) {
                price = prices[i];
            } else {
                // if the price is not less, check if the profit will be greater than what 
                // we already can get.
                if (prices[i]-price > profit) {
                    profit = prices[i]-price;
                }
            }
            
        }
        return profit;
    }
}