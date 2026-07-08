class Solution {
    public long sumAndMultiply(int n) {
        if(n == 0) return n;
        long sum = 0;
        StringBuilder sb = new StringBuilder();
        String str = String.valueOf(n);
        long nn = 0 ;
        for(char ss : str.toCharArray()){
            if(ss - '0' != 0){
                sb.append(ss);
                nn = nn*10 + ss-'0' ;

                sum += (ss-'0');
            }
        }
        System.out.println(sum + " ---------> " + sb);
        for(int i = 0 ;  i < sb.length() ; i++){
        }
        return (sum * nn);
    }
}