class Solution {
    public int divisorSubstrings(int num, int k) {
        
        int c = 0;
        int s = 0 ;
        int e = s + k -1;
        String str = String.valueOf(num) ;
        while(e < str.length()){
            String sub = str.substring(s,e+1);
            int val = Integer.parseInt(sub);

            if(val != 0 && num % Integer.parseInt(sub) == 0) c++;
            s++;
            e++;
        }
        return c;
    }
}