class Solution {
    public int largestInteger(int num) {
        ArrayList<Integer> e = new ArrayList<>();
        ArrayList<Integer> o = new ArrayList<>();
        String str = String.valueOf(num);
        for(int i = 0 ; i < str.length() ; i++){
            if((str.charAt(i) -'0' ) % 2 == 0) e.add( str.charAt(i) -'0');
            else o.add( str.charAt(i) -'0');
        }
        Collections.sort(e , Collections.reverseOrder());
        Collections.sort(o , Collections.reverseOrder());

        String s = "";
        int edx = 0;
        int odx = 0;
        for(int i = 0 ; i < str.length() ; i++){
            if((str.charAt(i)-'0') %2 == 0) s+= Integer.toString(e.get(edx++));
            else s+= Integer.toString(o.get(odx++));
        }

        return Integer.parseInt(s);



    }
}