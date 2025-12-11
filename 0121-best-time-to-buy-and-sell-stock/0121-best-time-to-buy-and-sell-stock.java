class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int buyPrice = prices[0];
        for (int i = 0; i < prices.length; i++) {
            int currentProfit = prices[i] - buyPrice;
            maxProfit=Math.max(currentProfit,maxProfit);
            buyPrice=Math.min(buyPrice,prices[i]);
        }
        return maxProfit;
    }
}