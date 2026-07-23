class Solution {
    public int maxProfit(int[] pr) {
        int sum = Integer.MIN_VALUE;
        int buy = pr[0];
        int sell = pr[0];
        for(int i : pr){
            if(buy >= i){
                buy = i;
            }else{
                sell = i;
            sum = Math.max(sum , sell-buy);
            }
            // System.out.println("buyyy->       " + buy + "    sell------->  " + sell + "  profit-->" + sum);
        }
        return sum!=Integer.MIN_VALUE?sum : 0;
    }
}