package pers.jiahao.leetcode.dp;

public class NO746MinCostClimbingStairs {
	public int minCostClimbingStairs(int[] cost) {
        int result = 0;
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i = 2;i<cost.length;i++){
            dp[i] = cost[i]+Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[cost.length-1],dp[cost.length-2]);
    }

}
