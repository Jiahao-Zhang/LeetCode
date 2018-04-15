package pers.jiahao.leetcode.array;

public class NO121BestTimetoBuyAndSellStock {

	public int maxProfit(int[] prices) {
        int T_ik0 = 0;
        int T_ik1 = Integer.MIN_VALUE;
        for(int i = 0;i<prices.length;i++){
            T_ik0 = Math.max(T_ik0,T_ik1+prices[i]);
            T_ik1 = Math.max(T_ik1, -prices[i]);
        }
        return T_ik0;
        
    }

}
