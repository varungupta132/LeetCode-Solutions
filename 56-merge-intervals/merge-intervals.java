class Solution {
    public int[][] merge(int[][] in) {
        Arrays.sort(in, (a, b) -> Integer.compare(a[0], b[0]));
        // System.out.println(in);
        ArrayList<int[]> arr = new ArrayList<>();
        int s = in[0][0];
        int e = in[0][1];
        for(int i = 1 ; i < in.length ; i++){
            if(e >= in[i][0]){
                e = Math.max(e , in[i][1]);
            }
            else{
                int[] xx = new int[2];
                xx[0]=s;
                xx[1]=e;
                arr.add(xx);
                s = in[i][0];
                e = in[i][1];
            }
        }
        int[] xx = new int[2];
                xx[0]=s;
                xx[1]=e;
                arr.add(xx);

        int[][] ans = new int[arr.size()][2];
        for(int i = 0 ; i < arr.size() ; i++){
            ans[i] = arr.get(i);
        }
        return ans;
    }
}