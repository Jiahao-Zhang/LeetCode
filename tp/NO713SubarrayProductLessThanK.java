package pers.jiahao.leetcode.tp;

public class NO713SubarrayProductLessThanK {
	public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        int product = 1;
        int left = 0;
        int right = 0;
        for(;right<nums.length;right++){
            product*=nums[right];
            while(left<=right&&product>=k){
                product/=nums[left];
                left++;
            }
            count+=right-left+1;
        }
        return count;
       
    }

}
