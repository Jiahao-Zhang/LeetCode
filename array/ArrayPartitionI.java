package pers.jiahao.leetcode.array;

import java.util.Arrays;

/**
 * LeetCode No.561 ArrayPartition I
 * link: https://leetcode.com/problems/array-partition-i/description/
 * @author jiahaozhang
 *
 */
public class ArrayPartitionI {
	 public int arrayPairSum(int[] nums) {
	        int result = 0;
	        Arrays.sort(nums);
	        for(int i = 0;i<nums.length;i+=2){
	            result+=nums[i];
	        }
	        return result;  
	    }
}
