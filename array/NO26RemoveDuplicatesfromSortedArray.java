package pers.jiahao.leetcode.array;

public class NO26RemoveDuplicatesfromSortedArray {
	 public int removeDuplicates(int[] nums) {
	        int index = 0;
	        for(int num:nums){
	            if(index<1||num>nums[index-1]){
	                nums[index] = num;
	                index++;
	            }
	        }
	        return index;
	    }
	

}
