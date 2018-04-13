package pers.jiahao.leetcode.array;

public class NO122BestTimetoBuyandSellStockII {
	 public int maxProfit(int[] prices) {
	        int max = 0;
	        for(int i = 0;i<prices.length;i++){
	            int j = i;
	            for(;j<prices.length-1;j++){
	                if(prices[j+1]-prices[j]<=0&&prices[i]<prices[j]){
	                    max+= prices[j]-prices[i];
	                    i = j;
	                    break;
	                }else if(prices[i]>prices[j]){
	                    i = j;
	                }
	            }
	            if(j==prices.length-1&&prices[i]<prices[j]){
	                max+=prices[j]-prices[i];
	                break;
	            }
	            
	        }
	        return max;
	    }

}
