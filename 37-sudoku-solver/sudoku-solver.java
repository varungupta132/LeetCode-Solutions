class Solution { 
    public void solveSudoku(char[][] bo) { 
        bt(bo, 0, 0); 
    } 
    public void bt(char[][] bo, int x, int y) { 
        
        if(filled(bo)) {
            return;
        }

        for(int i = 0; i < bo.length; i++) {          // change 1
            for(int j = 0; j < bo[0].length; j++) {   // change 2
                
                if(bo[i][j] == '.') {

                    for(int num = 1; num <= 9; num++) {   // change 3
                        
                        if(safe(bo, i, j, num)) {
                            
                            bo[i][j] = (char)('0' + num);

                            bt(bo, i, j);

                            // Agar solution mil gaya hai,
                            // to undo nahi karna
                            if(filled(bo)) {
                                return;
                            }

                            bo[i][j] = '.';
                        }
                    }

                    return; // sirf first empty cell ko solve karo
                }
            }
        }
    } 

    public boolean filled(char[][] bo) { 
        for(char[] chh : bo) { 
            for(char ch : chh) { 
                if(ch == '.') return false; 
            } 
        } 
        return true; 
    } 

    public boolean safe(char[][] bo, int i, int j, int num) { 
        
        // column
        for(int r = 0; r < bo.length; r++) { 
            if((bo[r][j] - '0') == num) 
                return false; 
        } 

        // row
        for(int c = 0; c < bo[0].length; c++) { 
            if((bo[i][c] - '0') == num) 
                return false; 
        } 

        // 3 x 3 box
        int rown = (i / 3) * 3; 
        int coln = (j / 3) * 3; 

        for(int x = rown; x < rown + 3; x++) { 
            for(int y = coln; y < coln + 3; y++) { 
                
                if((bo[x][y] - '0') == num) { 
                    return false; 
                } 
            } 
        } 

        return true; 
    } 
}