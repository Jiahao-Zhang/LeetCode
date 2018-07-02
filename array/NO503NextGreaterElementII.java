package pers.jiahao.leetcode.array;

public class NO503NextGreaterElementII {
	 public int[] nextGreaterElements(int[] nums) {
	        int[] result = new int[nums.length];
	        for(int i = 0;i<nums.length;i++){
	            int j = i+1;
	            while(j!=i){
	                if(j>=nums.length){
	                    j = 0;
	                    continue;
	                }
	                if(nums[j]>nums[i]){
	                    result[i] = nums[j];
	                    break;
	                }
	                j++;
	            }
	            if(j==i){
	                result[i] = -1;
	            }
	        }
	        return result;
	    }

}
