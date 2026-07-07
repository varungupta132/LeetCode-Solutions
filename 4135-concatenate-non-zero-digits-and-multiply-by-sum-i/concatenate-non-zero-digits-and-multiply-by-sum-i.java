class Solution {
    public long sumAndMultiply(int n) {
        if(n == 0) return n;
        long sum = 0;
        StringBuilder sb = new StringBuilder();
        String str = String.valueOf(n);
        for(char ss : str.toCharArray()){
            if(ss - '0' != 0){
                sb.append(ss);
                sum += (ss-'0');
            }
        }
        System.out.println(sum + " ---------> " + sb);
        return sum * Integer.parseInt(sb.toString());
    }
}