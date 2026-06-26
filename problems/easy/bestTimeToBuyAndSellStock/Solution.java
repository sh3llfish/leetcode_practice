class Solution {
    public int maxProfit(int[] prices) {
        // Stores the lowest price seen so far.
        // This represents the best day to buy before the current day.
        int min = prices[0];

        // Stores the maximum profit found so far.
        // If no profitable transaction exists, it stays 0.
        int answer = 0;

        // Start from day 1 because day 0 is already used as the initial minimum.
        for (int i = 1; i < prices.length; i++) {

            // If today's price is lower than the previous minimum,
            // update the best buying price.
            if (prices[i] < min) {
                min = prices[i];
            } 
            
            // Otherwise, sell today and calculate the profit.
            // Then keep the larger profit between current profit and previous best.
            else {
                answer = Math.max(answer, prices[i] - min);
            }
        }

        // Return the best profit from one buy and one sell.
        return answer;
    }
}
