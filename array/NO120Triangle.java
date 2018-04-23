package pers.jiahao.leetcode.array;

import java.util.List;

public class NO120Triangle {
	public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.size()];
        dp[0][0] = triangle.get(0).get(0);
        for(int i = 1;i<triangle.size();i++){
            dp[i][0] = triangle.get(i).get(0)+dp[i-1][0];
            dp[i][triangle.get(i).size()-1] = triangle.get(i).get(triangle.get(i).size()-1)+dp[i-1][triangle.get(i-1).size()-1];
        }
        for(int i = 2;i<triangle.size();i++){
            for(int j = 1;j<triangle.get(i).size()-1;j++){
                dp[i][j] = triangle.get(i).get(j)+Math.min(dp[i-1][j-1],dp[i-1][j]);
            }
        }
        int min = dp[triangle.size()-1][0];
        for(int i = 1;i<triangle.get(triangle.size()-1).size();i++){
            if(dp[triangle.size()-1][i]<min){
                min = dp[triangle.size()-1][i];
            }
        }
        return min;
        
        
        
    }

}
