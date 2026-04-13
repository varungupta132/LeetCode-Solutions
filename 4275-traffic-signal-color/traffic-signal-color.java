class Solution {
    public String trafficSignal(int ti) {
        if(ti == 0) return "Green";
        if(ti == 30) return "Orange";
        if(ti > 30 && ti <= 90 ) return "Red";

        return "Invalid";
    }
}