import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] ans = new String[score.length];
        int[] xyz = score.clone();
        Arrays.sort(xyz);

        // fill ranks in ans (based on sorted order)
        for(int i = 0 ; i < ans.length ; i++){
            if(i == 0){
                ans[i] = "Gold Medal";
            }
            else if(i == 1){
                ans[i] = "Silver Medal";
            }
            else if(i == 2){
                ans[i] = "Bronze Medal";
            }
            else{
                ans[i] = String.valueOf(i + 1);
            }
        }

        String[] res = new String[ans.length];

        // match original score with sorted xyz (reverse order)
        for(int i = 0; i < score.length; i++){
            for(int j = xyz.length - 1, k = 0; j >= 0; j--, k++){
                if(score[i] == xyz[j]){
                    res[i] = ans[k];
                    break;
                }
            }
        }

        return res;
    }
}