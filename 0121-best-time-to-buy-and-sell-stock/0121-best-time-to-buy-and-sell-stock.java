class Solution {
    public int maxProfit(int[] prices) {
       int maxProfitt = 0;
       int buy = 0;

       for(int sell=1; sell < prices.length; sell++){
           if(prices[sell] < prices[buy]){
            buy = sell;
           } else if(prices[sell] > prices[buy]){
             int profit = prices[sell] - prices[buy];
             if(profit > maxProfitt){
                maxProfitt = profit;
             }
           }
        }
        return maxProfitt;
    }
}