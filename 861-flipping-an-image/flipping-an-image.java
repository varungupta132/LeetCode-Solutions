class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] ans = new int[image.length][image[0].length];
        for(int i = 0 ; i < image.length ; i++){
            for(int j = 0 ; j < image[0].length ; j++){
                if(image[i][j] == 0){
                    ans[i][j] =1;
                }
                else{
                    ans[i][j] =0;
                }
            }
            int l = 0 ; 
            int r = image[0].length-1;
            while(l < r){
                int temp = ans[i][r];
                ans[i][r] = ans[i][l];
                ans[i][l] = temp; 
                l++;
                r--;
            }
        }
        return ans;
    }
}