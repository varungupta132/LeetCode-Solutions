class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for (char ch : text.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        int c = 0;

        while (true) {

            // check if one more "balloon" can be formed
            if (hm.getOrDefault('b', 0) >= 1 &&
                hm.getOrDefault('a', 0) >= 1 &&
                hm.getOrDefault('l', 0) >= 2 &&
                hm.getOrDefault('o', 0) >= 2 &&
                hm.getOrDefault('n', 0) >= 1) {

                // remove characters of one balloon
                hm.put('b', hm.get('b') - 1);   // corrected
                hm.put('a', hm.get('a') - 1);   // corrected
                hm.put('l', hm.get('l') - 2);   // corrected
                hm.put('o', hm.get('o') - 2);   // corrected
                hm.put('n', hm.get('n') - 1);   // corrected

                c++;
            } else {
                break;
            }
        }

        return c;
    }
}