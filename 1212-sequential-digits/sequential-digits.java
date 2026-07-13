class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> anss = new ArrayList<Integer>();
        int ll = String.valueOf(low).length();
        int hl = String.valueOf(high).length();
        while(ll<= hl){
            StringBuilder sb = new StringBuilder();
        for(int i = 1 ; i <= 10-ll ; i++){
            int ans = i;
            for(int j = i+1 ; j < i + ll ; j++){
                ans = ans*10 +j;
                // if(String.valueOf())
                if(ans>high) break;
            }
            if(ans <= high && ans >= low)
            anss.add(ans);
        }
        ll++;
        
        }

        return anss;
}
}