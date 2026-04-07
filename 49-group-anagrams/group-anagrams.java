class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lstt = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        Arrays.sort(strs);
        for(int i = 0 ; i < strs.length ; i++){
            List<String> lst = new ArrayList<>();
            if(hs.contains(i)) continue ;
            lst.add(strs[i]);
            hs.add(i);
            for(int j = i+1 ; j < strs.length ; j++){
                if(ana(strs[i] , strs[j]) && !hs.contains(strs[j])){
                    hs.add(j);
                    lst.add(strs[j]);
                }
            }
            lstt.add(lst);
        }

        return lstt;
    }

    public boolean ana(String a , String b){
        int[] freq = new int[26];
        boolean flag = true;
        for(char ch : a.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch : b.toCharArray()){
            freq[ch-'a']--;
            if(freq[ch-'a'] <0){
                return false;
            }
        }
        for(int i : freq){
            if(i!=0) return false;
        } 
        return true;
    }
}