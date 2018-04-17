package pers.jiahao.leetcode.array;

public class NO718MaximumLengthOfRepeatedSubarray {
	public int findLength(int[] A, int[] B) {
        int max = 0;
        if(A.length==0||B.length==0){
            return max;
        }
        int[][] dp = new int[A.length+1][B.length+1];
        for(int i = 0;i<A.length;i++){
            for(int j = 0;j<B.length;j++){
                if(A[i]==B[j]){
                    dp[i+1][j+1] = dp[i][j]+1;
                    max = Math.max(max,dp[i+1][j+1]);
                }
            }
        }
        return max;    
    }

}
