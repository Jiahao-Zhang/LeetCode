package pers.jiahao.leetcode.math;

public class NO279PerfectSquares {
	public int numSquares(int n) {
        if(n==1||n==0){
            return 1;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3;i<=n;i++){
           int j = 1;
           dp[i] = i;
           while(i-j*j>=0){
               dp[i] = Math.min(dp[i],dp[i-j*j]+1);
               j++;
           }
        }
        return dp[n];  
    }

}
