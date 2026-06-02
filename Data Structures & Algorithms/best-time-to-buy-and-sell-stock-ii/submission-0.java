class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, maxp = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxp = Math.max(maxp, maxp + prices[i] - prices[i - 1]);
        }
        return maxp;
    }
}