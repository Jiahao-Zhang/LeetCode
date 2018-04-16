package pers.jiahao.leetcode.array;

public class NO674LongestContinuousIncreasingSubsequence {
	 public int findLengthOfLCIS(int[] nums) {
	        int max = 0;
	        if(nums.length==0)
	            return max;
	        int count = 1;
	        for(int i = 0;i<nums.length-1;i++){
	            if(nums[i+1]>nums[i]){
	                count++;
	            }else{
	                if(count>max){
	                    max = count;
	                }
	                count = 1;
	            }
	        }
	        if(count>max)
	            max = count;
	        return max;
	        
	    }

}
