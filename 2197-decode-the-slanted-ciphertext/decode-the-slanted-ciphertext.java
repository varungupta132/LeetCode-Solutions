import java.lang.reflect.Method;

class Solution {
    public String decodeCiphertext(String en, int row) {
        int n = en.length();
        int col = n/row;
        char [][] dp = new char [row][col];
        int idx = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i <dp.length ; i++ ){
            for(int j = 0 ; j < dp[0].length ; j++){
                dp[i][j] = en.charAt(idx++);
            }
        }

        for(int i = 0 ; i < dp[0].length ; i++){
            
           int r = 0, c = i;
            while (r < row && c < col) {
                sb.append(dp[r][c]);
                r++;
                c++;
            }
        }
        Method[] methods = StringBuilder.class.getMethods();

        for (Method m : methods) {
            System.out.println(m.getName());
        }
        for(int i = sb.length()-1 ; i >=0 ; i--){
            if(sb.charAt(i) == ' ') sb.deleteCharAt(i);
            else break;
        }
        return sb.toString();
    }
}