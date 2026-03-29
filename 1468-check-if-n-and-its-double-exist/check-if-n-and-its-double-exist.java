class Solution {
    public boolean checkIfExist(int[] arr) {
        int z = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i : arr){
            if(i == 0 ) z++;
            hs.add(i);
        } 
        for(int i : hs){
            if(i== 0 &&  z > 1) return true;
            if(i !=0 && hs.contains(i*2)) return true;
        }
        return false;
    }
}