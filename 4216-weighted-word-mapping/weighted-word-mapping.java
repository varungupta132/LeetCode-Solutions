class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(String str : words){
            int curr = 0;
            for(char ch : str.toCharArray()){
                curr += weights[(ch-'a')];
            }
            curr = curr % 26;
            char result = (char) ('z' - (curr % 26));
            sb.append(result);
        }
        return sb.toString();
    }
}