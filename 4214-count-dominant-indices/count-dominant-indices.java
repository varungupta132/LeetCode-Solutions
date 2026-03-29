class Solution {
    public int dominantIndices(int[] nums) {
        double[] sufx = new double[nums.length];
        sufx[nums.length-1] = 0 ;
        int c = 0;
        for(int i = nums.length-2 ; i >=0 ; i--){
            
            sufx[i] = sufx[i+1]+nums[i+1];
        }

        // ) / (nums.length -1 - i);

        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i] > sufx[i]/(nums.length-1-i)) c++;
        }

        System.out.print(Arrays.toString(sufx));

        return c;

    }
}