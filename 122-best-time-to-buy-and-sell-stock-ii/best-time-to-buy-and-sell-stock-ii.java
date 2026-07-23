class Solution {
    public int maxProfit(int[] pr) {
        int sum = 0;
        int buy = pr[0];

        for(int i : pr){
            if(buy > i){
                buy =  i;
            }else{
                sum += (i-buy);
                buy=i;
            }
            System.out.println("buy--> " + buy + "  sell ---> " + i + "    profit---> "+sum);
        }
        return sum;
    }
}