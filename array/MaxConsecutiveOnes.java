package pers.jiahao.leetcode.array;

public class MaxConsecutiveOnes {
	 public int findMaxConsecutiveOnes(int[] nums) {
	        int result = 0;
	        int max = 0;
	        for(int i = 0;i<nums.length;i++){
	            if(nums[i]==1){
	                max++;
	            }else{
	                if(max>result){
	                    result = max;
	                }
	                max = 0;
	            }
	        }
	        if(max>result){
	            result = max;
	        }
	        return result;
	        
	    }
}
