class Solution {
    public int findMinDifference(List<String> timePoints) {
        if(timePoints.size()>1440)
    return 0;
        ArrayList<Integer> secondsList = new ArrayList<>();

        for (String time : timePoints) {
            String[] parts = time.split(":");

            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);

            int totalSeconds = hours * 3600 + minutes * 60;

            secondsList.add(totalSeconds);
        }

        Collections.sort(secondsList);

        int ans = Integer.MAX_VALUE;

        // Adjacent pairs
        for (int i = 1; i < secondsList.size(); i++) {
            ans = Math.min(ans, secondsList.get(i) - secondsList.get(i - 1));
        }

        // Circular difference
        int first = secondsList.get(0);
        int last = secondsList.get(secondsList.size() - 1);

        ans = Math.min(ans, (24 * 3600 - last) + first);

        return ans / 60;
    }
}