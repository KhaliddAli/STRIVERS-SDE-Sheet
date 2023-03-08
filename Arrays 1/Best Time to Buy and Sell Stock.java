//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

class Solution {
    public int maxProfit(int[] prices) {
        //taking 2 variables one to store the min value in the previous days ans one to keep track of the profit
        int minValueAtLeft = Integer.MAX_VALUE;
        int profit =0;
        //iterating only once making the time complexity O(N)
        for(int i=0;i<prices.length;i++){
            //changing min value of stock price if there is smaller value of it in future
            minValueAtLeft = Math.min(minValueAtLeft, prices[i]);
            //checking the profit on getting the greater value of stock in upcoming days with the smallest value of stock stored
            profit = Math.max(profit, (prices[i]-minValueAtLeft));
        }
        return profit;
    }
}