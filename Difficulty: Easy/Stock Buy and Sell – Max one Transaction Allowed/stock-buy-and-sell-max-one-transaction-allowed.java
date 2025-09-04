// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int buy = prices[0];
        int profit=0;
        for(int i =0; i <prices.length;i++){
            if(buy>prices[i]){
                buy = prices[i];
            }
            else if(prices[i]-buy > profit){
                profit = prices[i]-buy;
            }
        }
        return profit;
    }
}