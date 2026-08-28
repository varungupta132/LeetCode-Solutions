class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        int maxx = 0;
        int ans = 0;
        for(int[] x : edges){
            int u = x[0];
            int v = x[1];
            hm.put(u , hm.getOrDefault(v , 0) + 1);
            hm.put(v , hm.getOrDefault(u , 0) + 1);

            if(maxx < hm.getOrDefault(v , 0)){
                maxx = hm.getOrDefault(v , 0);
                ans = v;
            }
            else if(maxx < hm.getOrDefault(u , 0)){
                maxx = hm.getOrDefault(u , 0);
                ans = u;
            }
        }
        return ans;
    }
}