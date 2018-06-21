package pers.jiahao.leetcode.dp;

public class NO740DeleteandEarn {
	public int deleteAndEarn(int[] nums) {
        int[] sum = new int[10001];
        for(int n:nums){
            sum[n]+=n;
        }
        int[] dp = new int[10003];
        for(int i=10000;i>=0;i--){
            dp[i] = Math.max(sum[i]+dp[i+2],dp[i+1]);
        }
        return dp[0];
        
    }

}
