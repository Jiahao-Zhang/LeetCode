package pers.jiahao.leetcode.array;

import java.util.Arrays;

public class NO16_3SumClosest {
	 public int threeSumClosest(int[] nums, int target) {
	        Arrays.sort(nums);
	        int result = nums[0]+nums[1]+nums[2];
	        for(int i = 0;i<nums.length;i++){
	            int left = i+1;
	            int right = nums.length-1;
	            while(left<right){
	                int sum = nums[left]+nums[right]+nums[i];
	                if(sum>target){
	                    right--;
	                }else{
	                    left++;
	                }
	                if(Math.abs(sum-target)<Math.abs(result-target)){
	                    result = sum;
	                }
	            }
	        }
	        return result;
	    }

}
