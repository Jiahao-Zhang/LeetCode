package pers.jiahao.leetcode.dp;

public class NO6502KeysKeyboard {
	public int minSteps(int n) {
        if(n==1){
            return 0;
        }
        if(n==2){
            return 2;
        }
        if(n==3){
            return 3;
        }
        int[] dp = new int[n+1];
        dp[1] = 0;
        dp[2] = 2;
        dp[3] = 3;
        for(int i = 4;i<=n;i++){
            int temp = i;
            int j = 2;
            for(j = 2;j<=(int)Math.sqrt(temp)+1;j++){
                if(temp%j==0){
                    break;
                }
            }
            if(j>(int)Math.sqrt(temp)+1){
                dp[i] = i;
            }else{
                int number = temp/j;
                dp[i] = dp[number]+j;
            }
        }
        return dp[n];
        
    }

}
