package pers.jiahao.leetcode.array;

public class NO643MaximumAverageSubarrayI {
	 public double findMaxAverage(int[] nums, int k) {
	        int max = Integer.MIN_VALUE;
	        int sum = 0;
	        for(int i = 0;i<k;i++){
	            sum+=nums[i];
	        }
	        max = sum;
	        for(int i = k;i<nums.length;i++){
	            sum = sum+nums[i];
	            sum = sum-nums[i-k];
	            max = Math.max(sum,max);
	        }
	        return (double)max/(double)k;
	        
	    }

}
