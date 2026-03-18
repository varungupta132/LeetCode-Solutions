class Solution {
    public int maxArea(int[] height) {
        int l = 0 ;
        int r = height.length-1 ;
        int area = 0;
        while(l < r){
            int min = Math.min(height[l] , height[r]);
            area = Math.max(area , min*(Math.abs(r-l)));
            if(height[l] < height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return area;
    }
}