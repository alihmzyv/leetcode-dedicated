package org.general.leetcode;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int lowestPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < lowestPrice) {
                lowestPrice = price;
            }

            int maxProfitIfSoldToday = price - lowestPrice;
            if (maxProfitIfSoldToday > maxProfit) {
                maxProfit = maxProfitIfSoldToday;
            }
        }
        return maxProfit;
    }
}
