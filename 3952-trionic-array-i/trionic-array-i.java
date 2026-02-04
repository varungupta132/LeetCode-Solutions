class Solution {
    public boolean isTrionic(int[] nums) {
        if(nums.length<=3) return false;
        int i=0;
        while(i<nums.length-1 && nums[i]<nums[i+1]){
            i++;
        }
        if(i==0) return false;
        int mid=i;
        while(i<nums.length-1 && nums[i]>nums[i+1]){
            i++;
        }
        if(i==mid) return false;
        int mid2=i;
        while(i<nums.length-1 && nums[i]<nums[i+1]){
            i++;
        }
        if(mid2==i) return false;
        return i==nums.length-1;
        
    }
}