package pers.jiahao.leetcode.array;

import java.util.Random;

public class NO384ShuffleanArray {
	int[] nums = null;
    Random rand = new Random();
    public NO384ShuffleanArray(int[] nums) {
        this.nums = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        if(nums==null){
            return null;
        }
        int[] array = nums.clone();
        for(int i = 1;i<nums.length;i++){
            int j = rand.nextInt(i+1);
            int temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
        return array;
    }

}
