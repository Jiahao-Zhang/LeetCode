package pers.jiahao.leetcode.array;

public class NO287FindtheDuplicateNumber {
	 public int findDuplicate(int[] nums) {
	        int slow = nums[0];
	        int high = nums[0];
	        do{
	            slow = nums[slow];
	            high = nums[nums[high]];
	        }while(slow!=high);//ensure high is in the loop
	        slow = nums[0];
	        while(slow!=high){
	            slow = nums[slow];
	            high = nums[high];
	        }
	        
	        return slow;
	        
	    }

}
