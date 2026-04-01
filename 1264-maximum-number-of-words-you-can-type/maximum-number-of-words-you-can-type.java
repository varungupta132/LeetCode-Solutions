class Solution {
    public int canBeTypedWords(String text, String bro) {
        String[] arr = text.split(" ");
        int c = 0 ;
        HashSet<Character> hs = new HashSet<>();
        for(char ch :bro.toCharArray()){
            hs.add(ch);
        }
        for(String str : arr){
            boolean gadbad = false;
            for(char ch : hs){
                if(str.contains(String.valueOf(ch))){
                    gadbad = true;
                }
            }
            if(!gadbad){
                c++;
            }
        }

        return c;

    }
}