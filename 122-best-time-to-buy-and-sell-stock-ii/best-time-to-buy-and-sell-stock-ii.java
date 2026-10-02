class Solution {
    public int maxProfit(int[] pr) {
        int b = pr[0];
        int profit = 0 ;
        for(int i = 0 ; i < pr.length  ; i++){
            if(b > pr[i]){
                b = pr[i];
            }
            else{
                profit += (pr[i] - b);
                b = pr[i];
            }
            System.out.println(b);
        }
        return profit;
    }
}