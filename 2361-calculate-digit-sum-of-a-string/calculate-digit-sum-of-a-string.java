class Solution {
    public String digitSum(String s, int k) {
        int idx = 0;
        while(s.length() >k){
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < s.length();  i = i+k){
                // int mini = Math.min(i+k,s.length());
                String str = s.substring(i, Math.min(i+k , s.length()));
                // System.out.println(str);
                sb.append(sum(str));
                // System.out.println(str);
            }
            // sb.append(sum(s.substring(s.length()-(s.length()%k) , s.length())));
            // System.out.println(sb);
            s = sb.toString();
            // idx++;
        }
        return s;

    }
    public String sum(String str ){
        int sum = 0;
        for(char ch : str.toCharArray()){
            sum+= ch-'0';
        }
        return String.valueOf(sum);
    }
}