package pers.jiahao.leetcode.array;

import java.util.Arrays;

public class NO611ValidTriangleNumber {
	public int triangleNumber(int[] nums) {
        if(nums.length<=2){
            return 0;
        }
        Arrays.sort(nums);
        int count = 0;
        for(int i = nums.length-1;i>=1;i--){
            int k = i-1;
            int j = 0;
            while(j<k){
                if(nums[k]+nums[j]>nums[i]){
                    count+=k-j;
                    k--;
                }else{
                    j++;
                }
            }   
        }
        return count;
    }

}
