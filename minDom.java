class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        if(A[0] == B[0])
            return Count(A, B, A[0]);
        else return Math.max(Count(A, B, A[0]), Count(A, B, B[0]));
    }
    
    public int Count(int [] A, int [] B, int target)
    {
        int countTop = 0;
        int countBot = 0;
        int n = A.length;
        
        for(int i = 0; i != n; ++i)
        {
            if(A[i] != target && B[i] != target)
                return -1;
            else if(A[i] != target)
                ++countTop;
            else if(B[i] != target)
                ++countBot;
        }
        
        return Math.min(countBot, countTop);
    }
}
