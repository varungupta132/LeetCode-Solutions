class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int c = 0 ;
        int x = 0 ;
        for(int i : costs){
            if(coins >=i){
            coins -= i;
            x++; 
            // System.out.println("ohhhh yes ");
            }
            if(coins < i) break;
        }
        return x;
    }
}