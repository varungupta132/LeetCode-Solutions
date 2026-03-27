class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        for(int[] i : mat){
            k = k % i.length;
            int[] temp =i.clone();
            rotatee(temp , 0 , i.length-1);
            rotatee(temp , 0 , k-1);
            rotatee(temp , k , i.length-1);

            if(!Arrays.equals(i , temp)) return false;
        }
        return true;
    }
public int[] rotatee(int[] temp, int s, int e) {
    while (s < e) {
        int t = temp[s];
        temp[s] = temp[e];
        temp[e] = t;

        s++;
        e--;
    }
    return temp;
}
}