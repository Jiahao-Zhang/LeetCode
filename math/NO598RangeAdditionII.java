package pers.jiahao.leetcode.math;

public class NO598RangeAdditionII {
	public int maxCount(int m, int n, int[][] ops){
        if(ops==null||ops.length==0){
            return m*n;
        }
        int row = 40000;
        int col = 40000;
        for(int i = 0;i<ops.length;i++){
            row = Math.min(ops[i][0],row);
            col = Math.min(ops[i][1],col);
        }
        return row*col;
    
}

}
