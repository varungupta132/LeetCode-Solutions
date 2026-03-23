class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

int maxFreq = 0;
int ans = -1;

for(int num : arr){
    int freq = map.getOrDefault(num, 0) + 1;
    map.put(num, freq);

    if(freq > maxFreq){
        maxFreq = freq;
        ans = num;
    }
}

return ans;
    }
}