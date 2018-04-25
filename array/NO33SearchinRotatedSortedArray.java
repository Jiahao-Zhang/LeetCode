package pers.jiahao.leetcode.array;

public class NO33SearchinRotatedSortedArray {
	public int search(int[] nums, int target) {
        if(nums==null||nums.length==0){
            return -1;
        }
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = (right+left)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>nums[left]||nums[mid]>nums[right]){
                if(target<nums[mid]&&target>=nums[left]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }else if(nums[mid]<nums[left]||nums[mid]<nums[right]){
                if(target>nums[mid]&&target<=nums[right]){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }else{
                left++;
            }
        }
        return -1;
        
    }
	
}
