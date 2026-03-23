class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int i : arr){
            hm.put(i , hm.getOrDefault(i , 0) + 1);
        }  
        int ma = 0;
        int val = 0;
        for(int i : hm.keySet()){
            if(val < hm.get(i)){
                val = hm.get(i);
                ma = i;
            }
        }
        return ma;
    }
}