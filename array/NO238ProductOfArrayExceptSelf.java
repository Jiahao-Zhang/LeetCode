package pers.jiahao.leetcode.array;

public class NO238ProductOfArrayExceptSelf {
	 public int[] productExceptSelf(int[] nums) {
	        int[] output = new int[nums.length];
	        int left = 1;
	        for(int i = 0;i<nums.length;i++){
	            if(i == 0){
	                output[i] = left;
	            }else{
	                left = left*nums[i-1];
	                output[i] = left;
	            }
	        }
	        int right = 1;
	        for(int i = nums.length-1;i>=0;i--){
	            if(i==nums.length-1){
	                output[i] *=right;
	            }else{
	                right = right*nums[i+1];
	                output[i]*= right;
	            }
	        }
	        return output;
	    }

}
