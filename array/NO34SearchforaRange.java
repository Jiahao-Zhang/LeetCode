package pers.jiahao.leetcode.array;

public class NO34SearchforaRange {
	 public int[] searchRange(int[] nums, int target) {
	        int[] result = new int[2];
	        result[0] = -1;
	        result[1] = -1;
	        if(nums==null||nums.length==0){
	            return result;
	        }
	        int left = 0;
	        int right = nums.length-1;
	        int mid = (left+right)/2;
	        while(left<=right){
	            mid = (left+right)/2;
	            if(nums[mid]>target){
	                right = mid-1;
	            }else if(nums[mid]<target){
	                left = mid+1;
	            }else{
	                break;
	            }
	        }
	       if(left>right){
	           return result;
	       }else{
	           int start = mid;
	           int end = mid;
	           while(start>=0&&nums[start]==target){
	               start--;
	           }
	           while(end<nums.length&&nums[end]==target){
	               end++;
	           }
	           result[0] = start+1;
	           result[1] = end-1;
	           return result;
	       }
	        
	    }

}
