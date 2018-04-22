package pers.jiahao.leetcode.array;

public class NO80RemoveDuplicatesfromSortedArrayII {
	 public int removeDuplicates(int[] nums) {
	        int index = 0;
	        for(int num:nums){
	            if(index<2||num>nums[index-2]){
	                nums[index] = num;
	                index++;
	            }
	        }
	        return index;
	    }

}
