package pers.jiahao.leetcode.array;

public class NO35SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
        int index = 0;
        for(int i = 0;i<nums.length;i++){
            if(target == nums[i]){
                index = i;
                break;
            }else if(target>nums[i]){
                index++;
            }else{
                break;
            }
        }
        return index;
    }
}
