import java.util.*;

class Solution {
    public List<String> generateValidStrings(int n, int k) {
        List<String> ans = new ArrayList<>();
        for(int i = 0 ; i < Math.pow(2 , n) ; i++){
            String binary = Integer.toBinaryString(i);
            StringBuilder sb = new StringBuilder();
            while (sb.length() < n - binary.length()) {
                sb.append('0');
            }
            sb.append(binary);
            String padded = sb.toString();

            if(check(padded , k) <= k) ans.add(padded);
        }
        return ans;
    }
    
    public int check(String x , int k ){
        int s = 0;
        for(int i = 0 ; i < x.length() ; i++ ){
            if(i > 0 && x.charAt(i-1) == '1' && x.charAt(i) == '1'){

                return Integer.MAX_VALUE;
            }
            if(x.charAt(i) == '1'){
                s = s + i;
            }
        }
        return s;
    }
}
