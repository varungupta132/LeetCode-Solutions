import java.util.HashMap;

class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int[] x : edges) {
            int u = x[0];
            int v = x[1];
            
            // अपनी फ्रीक्वेंसी खुद बढ़ाएं (getOrDefault में सही वेरिएबल का उपयोग करें)
            hm.put(u, hm.getOrDefault(u, 0) + 1);
            hm.put(v, hm.getOrDefault(v, 0) + 1);

            // चूँकि सेंटर नोड हर एज में आता है, जैसे ही किसी नोड की 
            // फ्रीक्वेंसी 2 होगी, वह पक्का सेंटर नोड ही होगा!
            if (hm.get(u) > 1) return u;
            if (hm.get(v) > 1) return v;
        }
        return 0;
    }
}
