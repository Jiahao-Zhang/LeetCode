package pers.jiahao.leetcode.math;

import java.util.Arrays;

public class NO462MinimumMovestoEqualArrayElementsII {
	 public int minMoves2(int[] nums) {
	        Arrays.sort(nums);
	        int mid = 0;
	        if(nums.length%2==0){
	            mid = (nums[(nums.length-1)/2]+nums[(nums.length-1)/2+1])/2;
	        }else{
	            mid = nums[(nums.length-1)/2];
	        }
	        int sum = 0;
	        for(int i = 0;i<nums.length;i++){
	            sum+=Math.abs(nums[i]-mid);
	        }
	        return sum; 
	    }

}
