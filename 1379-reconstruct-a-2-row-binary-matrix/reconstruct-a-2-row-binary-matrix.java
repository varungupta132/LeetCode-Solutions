import java.util.*;

public class Solution {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        int n = colsum.length;

        int sum = 0;
        for(int x : colsum) sum += x;

        if(sum != upper + lower) return new ArrayList<>();

        int[] top = new int[n];
        int[] bottom = new int[n];

        // Step 1: fill colsum = 2
        for(int i = 0; i < n; i++){
            if(colsum[i] == 2){
                top[i] = 1;
                bottom[i] = 1;
                upper--;
                lower--;
            }
        }

        // Step 2: fill colsum = 1
        for(int i = 0; i < n; i++){
            if(colsum[i] == 1){
                if(upper > 0){
                    top[i] = 1;
                    upper--;
                } else {
                    bottom[i] = 1;
                    lower--;
                }
            }
        }

        // final check
        if(upper != 0 || lower != 0) return new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(Arrays.stream(top).boxed().toArray(Integer[]::new)));
        result.add(Arrays.asList(Arrays.stream(bottom).boxed().toArray(Integer[]::new)));

        return result;
    }
}