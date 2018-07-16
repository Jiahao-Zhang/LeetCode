package pers.jiahao.leetcode.math;

public class NO421MaximumXORofTwoNumbersinanArray {
	public int findMaximumXOR(int[] nums) {
	       
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            for(int j = i;j<nums.length;j++){
                max = Math.max(nums[i]^nums[j],max);
            }
        }
        return max;
        
    }
	

}
