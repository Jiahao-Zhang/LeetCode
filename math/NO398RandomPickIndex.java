package pers.jiahao.leetcode.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NO398RandomPickIndex {
	private int[] nums = null;
    public NO398RandomPickIndex(int[] nums) {
        this.nums = nums;
    }
    
    public int pick(int target) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==target){
                list.add(i);
            }
        }
        Random random = new Random();
        int index = random.nextInt(list.size());
        return list.get(index);
    }

}
