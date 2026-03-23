class Solution {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        int sum = 0;
        for(int i : colsum){
            sum += i;
        }
        if(upper+lower != sum) return new ArrayList<>();
        int[] top = new int[colsum.length];
        int[] down = new int[colsum.length];

        for(int i = 0 ; i < colsum.length ; i++){
            if(colsum[i] == 2 ){
                top[i] = 1 ;
                down[i] = 1;
                upper--;
                lower--;
            }
        }


            for(int i = 0 ; i < colsum.length ; i++){
            if(colsum[i] == 1 ){
                    if(upper>0){
                        top[i] = 1;
                        upper--;
                    }else{
                        down[i] = 1;
                        lower--;
                    }
                }
        }

        if(upper != 0 || lower != 0) return new ArrayList<>();

        List<List<Integer>> aaa = new ArrayList<>();
            ArrayList<Integer> a1 = new ArrayList<>();
            ArrayList<Integer> a2 = new ArrayList<>();
            for(int i : top){
                a1.add(i);
            }
            for(int i : down){
                a2.add(i);
            }
            aaa.add(a1);
            aaa.add(a2);
    return aaa;
    }
}