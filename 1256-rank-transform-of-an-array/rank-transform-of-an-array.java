class Solution {
    public int[] arrayRankTransform(int[] arr) {

        if (arr.length == 0) {
            return new int[0];
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            pq.offer(num);
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        int rank = 1;
        int prev = pq.poll();
        map.put(prev, rank);

        while (!pq.isEmpty()) {
            int curr = pq.poll();

            if (curr != prev) {
                rank++;
            }

            map.put(curr, rank);
            prev = curr;
        }

        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ans[i] = map.get(arr[i]);
        }

        return ans;
    }
}