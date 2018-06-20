package pers.jiahao.leetcode.dp;

public class NO338CountingBits {
	public int[] countBits(int num) {
        int[] dp = new int[num+1];
        dp[0] = 0;
        int j = 0;
        int pow = 2;
        int i = 1;
        for(i = 1,j=0;i<=num;i++,j++){
            if(i==pow){
                pow*=2;
                j = 0;
            }
            dp[i] = dp[j]+1;
              
        }
        return dp;
    }

}
