package pers.jiahao.leetcode.dp;

import java.util.Arrays;

public class NO646MaximumLengthofPairChain {
	public int findLongestChain(int[][] pairs) {
        int[] dp = new int[pairs.length];
        int max = 0;
        for(int i = 0;i<dp.length;i++){
            dp[i] = 1;
        }
        Arrays.sort(pairs,(a,b)->(a[0]-b[0]));
        for(int i = 1;i<pairs.length;i++){
            int index = i-1;
            while(index>=0&&pairs[index][1]>=pairs[i][0]){
                index--;
            }
            if(index>=0){
                dp[i] = dp[index]+1;
            }
            max = Math.max(max,dp[i]);
        }
        return max;
        
    }

}
