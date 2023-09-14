class Solution {
     public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            int profitToday = prices[i] - prices[i - 1];
            if (profitToday > 0) {
                maxProfit += profitToday;
            }
        }
        
        return maxProfit;
    }
}
