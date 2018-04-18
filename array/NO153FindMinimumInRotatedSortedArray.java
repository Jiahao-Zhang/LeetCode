package pers.jiahao.leetcode.array;

public class NO153FindMinimumInRotatedSortedArray {
	public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int mid = 0;
        while(left<right){
            mid = (left+right)/2;
            if(nums[mid]>nums[right]){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return nums[(left+right)/2];
    }

}
