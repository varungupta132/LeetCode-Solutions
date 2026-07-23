class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int sum = 0;
        int i = 0 ; 
        int j = 0;
        while(i < g.length && j < s.length){
            if(g[i] <= s[j]){
                i++;
                j++;
                sum++;
            }
            else{
                j++;
            }
        }
        return sum;
        
        // return sum;
        
    }
}