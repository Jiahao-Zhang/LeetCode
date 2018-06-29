package pers.jiahao.leetcode.dp;

public class NO718MaximumLengthofRepeatedSubarray {
	public int findLength(int[] A, int[] B) {
        int max = 0;
        if(A.length==0||B.length==0){
            return 0;
        }
        int[][] dp = new int[A.length+1][B.length+1];
        for(int i = 1;i<dp.length;i++){
            for(int j = 1;j<dp[0].length;j++){
                if(A[i-1]==B[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                    max = Math.max(max,dp[i][j]);
                }
            }
        }
        return max;
    }

}
