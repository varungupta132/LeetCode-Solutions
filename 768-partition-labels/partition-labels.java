class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] freq = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            freq[s.charAt(i)-'a'] = i ;
        }

        int se = 0 ;
        int e = 0 ;

        List<Integer> lst = new ArrayList<>();

        for(int i = 0 ; i < s.length() ; i++){
            e = Math.max(e , freq[s.charAt(i) - 'a']);
            if(e == i){
            lst.add(e - se +1);
            se = i+1;

            } 
        }
        return lst;
    }
}