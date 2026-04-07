class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> lst = new ArrayList<>();
        for(String str : words){
            if(lst.isEmpty() || !anag(str , lst.get(lst.size()-1))){
                lst.add(str);
            }
        }
        return lst;
    }
    public boolean anag(String a , String b){
        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);
    }
}