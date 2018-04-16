package pers.jiahao.leetcode.array;

public class NO747LargestNumberAtLeastTwiceofOthers {
	public int dominantIndex(int[] nums) {
        int result = -1;
        if(nums.length==0){
            return result;
        }
        int max = nums[0];
        int index = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
                index = i;
            }
        }
        for(int i = 0;i<nums.length;i++){
            if(i == index){
                continue;
            }
            if(2*nums[i]>max){
                index = -1;
                break;
            }
        }
        result = index;
        return result;
        
    }

}
