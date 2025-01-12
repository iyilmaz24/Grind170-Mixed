class Solution {
    public int maxProfit(int[] prices) {
        int minP = prices[0];
        int maxProfit = 0;

        for (int price : prices) {
            if (price > minP && (price - minP) > maxProfit) {
                maxProfit = price - minP;
            }

            minP = Math.min(price, minP);
        }

        return maxProfit;
    }
}