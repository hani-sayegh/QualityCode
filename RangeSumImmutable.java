class NumArray {

    int [] prefixArray;
    public NumArray(int[] nums) {
        int n = nums.length + 1;
        prefixArray = new int[n];
        for(int i = 1; i != n; ++i)
            prefixArray[i] = prefixArray[i - 1] + nums[i - 1];
    }
    
    public int sumRange(int i, int j) {
        return prefixArray[j + 1] - prefixArray[i];
    }
}   

/**
 [a,b,c,d,e,f,g]
 
          Idx:  0,   1  ,   2      ,  3           , 4
 Prefix Array: [0, a, a + b, a + b + c, a + b + c + d, etc..]
 **/
