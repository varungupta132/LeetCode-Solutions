class Solution {
    public int maxDigitRange(int[] nums) {
        int dd = 0;
        int sum = 0 ;
        int[] copy = nums.clone();
        int[] copy2 = nums.clone();
        for(int i : nums){
            int s = Integer.MAX_VALUE;
            int l = Integer.MIN_VALUE;
            while(i > 0){
                int x = i%10;
                i = i / 10;

                s = Math.min(s , x);
                l = Math.max(l , x);
                dd = Math.max(dd , l-s);
            }
        }
        int idx = 0;
        for(int i : copy){
            int s = Integer.MAX_VALUE;
            int l = Integer.MIN_VALUE;
            
            while(i > 0){
                int x = i%10;
                i = i / 10;

                s = Math.min(s , x);
                l = Math.max(l , x);
            }
                if(l-s == dd){
                    sum+= copy2[idx];
                    System.out.println(copy2[idx]);
                    // break;
                }
            idx++;
        }
        return sum;
    }
}