package pers.jiahao.leetcode.array;

public class NO154FindMinimuminRotatedSortedArrayII {
	 public int findMin(int[] nums) {
	        int left = 0;
	        int right = nums.length-1;
	        while(left<right){
	            int middle = (right+left)/2;
	            if(nums[middle]>nums[right]){
	                left = middle+1;
	            }else if(nums[middle]<nums[right]){
	                right = middle;//because nums[middle] may be the min
	            }else{
	                right--;
	            }
	        }
	        return nums[left];
	    }

}
