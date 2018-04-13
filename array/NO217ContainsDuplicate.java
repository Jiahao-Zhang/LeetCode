package pers.jiahao.leetcode.array;

import java.util.Arrays;

public class NO217ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
        boolean result = false;
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i+1]==nums[i]){
                result = true;
                break;
            }
        }
        return result;
        
    }

}
