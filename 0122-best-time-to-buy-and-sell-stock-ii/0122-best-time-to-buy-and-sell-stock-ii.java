class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        // Edge case: prices sorted ascending
        boolean ascending = true;
        for (int i = 1; i < n; i++) {
            if (prices[i - 1] > prices[i]) {
                ascending = false;
                break;
            }
        }
        if (ascending) return prices[n - 1] - prices[0];

        // Edge case: prices sorted descending
        boolean descending = true;
        for (int i = 1; i < n; i++) {
            if (prices[i - 1] < prices[i]) {
                descending = false;
                break;
            }
        }
        if (descending) return 0;

        // Main logic
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
        
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }
}