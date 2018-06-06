package pers.jiahao.leetcode.math;

public class NO453MinimumMovestoEqualArrayElements {
	 public int minMoves(int[] nums) {
	        int sum = 0;
	        int n = nums.length;
	        int min = Integer.MAX_VALUE;
	        for(int num:nums){
	            sum+=num;
	            if(num<min){
	                min = num;
	            }
	        }
	        return sum-min*n;
	    }

}
