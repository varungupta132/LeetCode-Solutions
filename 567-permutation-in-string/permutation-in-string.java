class Solution {
    public boolean checkInclusion(String s1, String s2) {

        char[] a = s1.toCharArray();
        Arrays.sort(a);

        String target = new String(a);

        int k = s1.length();

        for(int i=0;i<=s2.length()-k;i++){

            String sub = s2.substring(i,i+k);

            char[] b = sub.toCharArray();
            Arrays.sort(b);

            if(target.equals(new String(b))){
                return true;
            }
        }

        return false;
    }
}