class Solution {
    public List<Integer> findGoodIntegers(int n) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        List<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i*i*i < n; i++){
            for(int j = i+1 ; j*j*j < n ; j++){
                int num = i*i*i + j*j*j;
                if(num > n) break;
                hm.put(num , hm.getOrDefault(num , 0) + 1); 
            }
        }
        for(int k : hm.keySet()){
            if(hm.get(k) >= 2){
                arr.add(k);
            }
        }
        Collections.sort(arr);
        return arr;
    }
}