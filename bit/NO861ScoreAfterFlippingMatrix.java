package pers.jiahao.leetcode.bit;

public class NO861ScoreAfterFlippingMatrix {
	public int matrixScore(int[][] A) {
        int M = A.length;
        int N = A[0].length;
        int result = (1<<(N-1))*M;
        for(int j = 1;j<N;j++){
            int cur = 0;
            for(int i = 0;i<M;i++){
                if(A[i][0]==A[i][j]){
                    cur++;
                }
            }
            result+=Math.max(cur,M-cur)*(1<<(N-j-1));
        }
        return result;
        
        
    }

}
