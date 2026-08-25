class Solution {
    public int canBeTypedWords(String text, String br) {
        String[] str = text.split(" ");
        int c = 0;
    for(String s : str){
            boolean mila = true;
        for(char ch : br.toCharArray() ){
            if(s.contains(ch+"")){
                    mila = false;
                    break;
                }
            }
            if(mila) c++;
        }
        return c;
    }
}