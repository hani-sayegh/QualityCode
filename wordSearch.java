class Solution {
    
    char [][] b;
    String w;
    int rCount;
    int cCount;
    
    int [] rD = new int[]{1, -1, 0, 0};
    int [] cD = new int[]{0, 0,  1, -1};
    
    public boolean exist(char[][] board, String word) {
        
        rCount = board.length;        
        cCount =  board[0].length;
        b = board;
        w = word;
        
        for(int r = 0; r != rCount; ++r)
        {
            for(int c = 0; c != cCount; ++c)
            {
                boolean result = DFS(r, c, 0);
                if(result)
                    return true;
            }
        }
        return false;
    }
    
    boolean DFS(int r, int c, int idx)
    {
        if(b[r][c] == w.charAt(idx))
        {
           if(idx == w.length() - 1)
             return true;
            
            char pre = b[r][c];
            b[r][c] = '1';
            
            for(int i= 0; i < 4; ++i)
            {
                int rN = r + rD[i];
                int cN = c + cD[i];
                
                if(rN >= 0 && rN < rCount && cN >= 0 && cN < cCount)
                {
                    if(DFS(rN, cN, idx + 1))
                        return true;
                }
            }
            
            b[r][c] = pre;
        }
        return false;
    }
}
