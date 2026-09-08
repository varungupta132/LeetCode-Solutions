class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        ArrayList<Integer> fl = new ArrayList<>();
        ArrayList<Integer> sl = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++){
            int x = solve(nums , i , i+firstLen);
            fl.add(x);
            int y = solve(nums , i , i+secondLen);
            sl.add(y);
        }
        System.out.println(fl);
        
        System.out.println(sl);

        int max = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = 0 ; j < nums.length ; j++){
                if( j <= i-secondLen ||  j >= i + firstLen ){
                    // System.out.println("value of iiii-->" + i + "j----->" + j);
                    max = Math.max(max , 
                    fl.get(i) +
                    sl.get(j));
                    // System.out.println("done ye wala");
                }
            }
        }

        return max;
    }

    public int solve(int[] nums , int s , int e ){
        int sum = 0 ;
        for(int i = s ; i < nums.length && i < e ; i++){
            sum += nums[i];
        }
        return sum;

    }
}