package pers.jiahao.leetcode.array;

public class NO123BestTimetoBuyAndSellStockIII {
	 public int maxProfit(int[] prices) {
	        int T_20 = 0;
	        int T_21 = Integer.MIN_VALUE;
	        int T_10 = 0;
	        int T_11 = Integer.MIN_VALUE;
	        for(int i = 0;i<prices.length;i++){
	            T_20 = Math.max(T_20,T_21+prices[i]);
	            T_21 = Math.max(T_21,T_10-prices[i]);
	            T_10 = Math.max(T_10,T_11+prices[i]);
	            T_11 = Math.max(T_11,-prices[i]);
	        }
	        return T_20;
	        
	        
	    }

}
