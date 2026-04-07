class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];
        StringBuilder sb = new StringBuilder();
        HashSet<Character> hs = new HashSet<>();
        for(char ch : s.toCharArray()){
            freq[(int)ch]++;
            hs.add(ch);
        }
        for(int i = 0 ; i < hs.size() ; i++){
            int max = 0;
            int idx = 0;
            for(int j = 0 ; j < freq.length ; j++){
                if(max < freq[j]){
                    max = freq[j];
                    idx = j; 
                }
            }

            // StringBuilder sb = new StringBuilder();
            for (int k = 0; k < max; k++) {
                sb.append((char)(idx));  // append the string repeatedly
            }
            freq[idx] = 0;
        }

        return sb.toString();
    }
}