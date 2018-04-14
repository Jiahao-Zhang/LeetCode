package pers.jiahao.leetcode.array;

public class NO714BestTimetoBuyandSellStockwithTransactionFee {
	  public int maxProfit(int[] prices, int fee) {
	        int TodayHasOneStock = Integer.MIN_VALUE;
	        int TodayHasZeroStock = 0;
	        for(int price:prices){
	            int LastDayProfit = TodayHasZeroStock;
	            TodayHasZeroStock = Math.max(TodayHasZeroStock, TodayHasOneStock+price);
	            TodayHasOneStock = Math.max(TodayHasOneStock,LastDayProfit-price-fee);
	        }
	        return TodayHasZeroStock;
	    }
}
