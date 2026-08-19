import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character , Character > hm = new HashMap<>();
        for(int i = 0; i < s.length() ; i++){
            // FIX 1: Change s.charAt(i) to t.charAt(i) inside containsValue()
            // FIX 2: Check containsKey SEPARATELY from containsValue
            if(! hm.containsKey(s.charAt(i))) {
                if (hm.containsValue(t.charAt(i))) {
                    return false; 
                }
                hm.put(s.charAt(i) , t.charAt(i));
            }
            else{
                // Your original check works perfectly here!
                if(hm.get(s.charAt(i) )  != t.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
}
