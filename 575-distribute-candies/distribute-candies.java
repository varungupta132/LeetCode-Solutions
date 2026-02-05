class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();

        // array ke saare elements HashSet me daal do
        for (int candy : candyType) {
            set.add(candy);
        }
        int n = candyType.length /2;
        return Math.min(n , set.size());
    }
}