class Solution {
    public int minOperations(int[] nums) {
        int c = 0;

        for(int i = 0 ; i < nums.length ; i++){
            if(i %2 == 0){
                if(prime(nums[i])){
                    continue;
                }
                else{
                    while(!prime(nums[i])){
                        nums[i]++;
                        c++;
                    }
                }
            }
            else{
                if(!prime(nums[i])){
                    continue;
                }
                else{
                    while(prime(nums[i])){
                        nums[i]++;
                        c++;
                    }
                }
            }
        }

        return c;
    }
    public boolean prime(int a ){
        if(a <2) return false;
        for(int i = 2 ; i*i <= a ; i++ ){
            if(a%i == 0) return false;
        }
        return true;
    }
}