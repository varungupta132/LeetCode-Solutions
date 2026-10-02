class Solution {
    public int maxProfit(int[] prices) {
        int b = prices[0];
        int profit = 0 ;
        for(int i = 0 ; i < prices.length ; i++){
            if(b > prices[i]){
                b = prices[i];
            }
            // System.out.println(b);
            // else{
                int prof = prices[i] - b ;
                profit = Math.max(profit , prof);
            // }
        }
        return profit;
    }
}