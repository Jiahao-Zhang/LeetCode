package pers.jiahao.leetcode.array;

public class NO27RemoveElement {
	 public int removeElement(int[] nums, int val) {
	        int length = nums.length;
	        for(int i = 0;i<length;i++){
	            if(nums[i]==val){
	                for(int j = i;j<length-1;j++){
	                    nums[j] = nums[j+1];
	                }
	                length--;
	                i--;
	            }
	        }
	        return length;
	    }

}
