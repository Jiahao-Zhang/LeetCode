package pers.jiahao.leetcode.array;

public class NO53MaximumSubarray {
	 public int maxSubArray(int[] nums) {
	        int[] dp = new int[nums.length];
	        dp[0] = nums[0];
	        for(int i = 1;i<nums.length;i++){
	            dp[i] = Math.max(nums[i],nums[i]+dp[i-1]);
	        }
	        int max = dp[0];
	        for(int i = 1;i<nums.length;i++){
	            if(dp[i]>max){
	                max = dp[i];
	            }
	        }
	        return max;
	        
	    }

}
