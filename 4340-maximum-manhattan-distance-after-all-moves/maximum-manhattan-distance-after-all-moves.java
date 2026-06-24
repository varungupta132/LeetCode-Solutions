class Solution {
    public int maxDistance(String moves) {
        int und = 0 ;
        int rl = 0 ;
        int ud = 0 ;
        for(int i = 0 ; i < moves.length() ; i++){
            if( moves.charAt(i) == 'R'  ){
                rl++;
            }
            else if(  moves.charAt(i) == 'L'){
                rl--;
            }
            else if( moves.charAt(i) == '_'){
                und++;
            }
            else if(  moves.charAt(i) == 'U'){
                ud--;
            }
            else{
                ud++;
            }
        }
        // System.out.println(ud + " " + rl + " " + und);

        // int dis = Math.max(  Math.abs(0-rl) + Math.abs(0-ud) +und    ,     Math.abs(0-ud)+und        );
        return Math.abs(0-rl) + Math.abs(0-ud) +und;
    }
}