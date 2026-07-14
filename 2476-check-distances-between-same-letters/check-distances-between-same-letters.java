class Solution {
    public boolean checkDistances(String s, int[] distance) {
        HashMap<Character, ArrayList<Integer>> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hm.putIfAbsent(ch, new ArrayList<>());
            hm.get(ch).add(i);
        }
        System.out.println(hm);
        for(char ch : hm.keySet()){
            ArrayList<Integer> mm = hm.get(ch);
            int dis = Math.abs(mm.get(0) - mm.get(1));
            if(dis-1 != distance[ch-'a']) return false;
        }
        return true;
    }
}