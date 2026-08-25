class Solution {
    List<List<String>> lst;
    public List<List<String>> solveNQueens(int n) {
        lst = new ArrayList<>();
        List<List<String>> bo = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            List<String > temp = new ArrayList<>();
            for(int j = 0 ; j < n ; j++){
                temp.add(".");
            }
            bo.add(temp);
        }
        bt(bo , n , 0);
        return lst;
    }
    public void  bt(List<List<String>> bo , int n , int row){
        if(row == n){
            List<String> result = bo.stream()
            .map(innerList -> String.join("", innerList)) // Joins with a space
            .collect(Collectors.toList());
            lst.add(result);
            return;
        }

        for(int c = 0 ; c < bo.size() ; c++){
            if(safe(bo , n , row , c)){
                bo.get(row).set(c, "Q");
                bt(bo , n , row+1);
                bo.get(row).set(c, ".");
            }
        }
    }

    public boolean safe(List<List<String>> bo , int n , int row , int c){
        for(int i = 0 ; i < bo.size() ; i++){
            if(row == i) continue ;
            if(bo.get(i).get(c).equals("Q")) return false;
        }

        for(int i = row-1 ,j = c-1 ; i >= 0 && j >= 0 ; i-- , j--){
            if(bo.get(i).get(j).equals("Q")) return false;
        }
        for(int i = row-1 , j = c+1 ; i >= 0 && j < bo.size() ; j++ , i--){
            if(bo.get(i).get(j).equals("Q")) return false;
        }
        return true;
    }
}