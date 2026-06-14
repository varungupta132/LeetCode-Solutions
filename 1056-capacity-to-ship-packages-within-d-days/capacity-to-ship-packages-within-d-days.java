class Solution {
    public int shipWithinDays(int[] we, int da) {

        int l = 0;
        int r = 0;

        for(int w : we){
            l = Math.max(l, w);
            r += w;
        }

        while(l <= r){

            int mid = l + (r - l) / 2;

            if(check(mid, we, da)){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }

        return l;
    }

    public boolean check(int cap, int[] we, int da){

        int days = 1;
        int curr = 0;

        for(int w : we){

            if(curr + w > cap){
                days++;
                curr = w;
            }
            else{
                curr += w;
            }
        }

        return days <= da;
    }
}