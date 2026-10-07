class Solution{
  public int combinationSum4(int[] nums, int target){

    int[] dp = new int[target+1];

    // Arrays.fill(dp , 0);

    dp[0] = 1;
      for(int j = 1 ; j <= target ;j++){


    for(int i : nums){

        // if(j-i == 0) dp[j]+=1; 

        if(j >= i)

        dp[j] += dp[j-i];

      }

    }

    System.out.println(Arrays.toString(dp));

    return dp[target];

  }

}