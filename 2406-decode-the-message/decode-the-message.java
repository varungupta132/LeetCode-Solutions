class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character , Character> map = new HashMap<>();
        char ch = 'a';
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);

            if (c == ' ') continue;

            if (!map.containsKey(c)) {
                map.put(c, ch);
                ch++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char chh : message.toCharArray()){
            if(chh != ' ')
            sb.append(map.get(chh));
            else sb.append(" ");
        }
        return sb.toString();
    }
}