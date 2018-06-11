package pers.jiahao.leetcode.math;

import java.util.HashMap;

public class NO645SetMismatch {
	public int[] findErrorNums(int[] nums) {
        if(nums==null||nums.length==0){
            return null;
        }
        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i = 1;i<=nums.length;i++){
            if(!map.containsKey(i)){
                result[1] = i;
            }else{
                if(map.get(i)==2){
                    result[0] = i;
                }
            }
        }
        return result;
        
    }

}
