package pers.jiahao.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;

public class NO506RelativeRanks {
	public String[] findRelativeRanks(int[] nums) {
        String[] result = new String[nums.length];
        if(nums==null||nums.length==0){
            return result;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            if(i==nums.length-1){
                result[map.get(nums[i])] = "Gold Medal";
                continue;
            }
            if(i==nums.length-2){
                result[map.get(nums[i])] = "Silver Medal";
                continue;
            }
            if(i==nums.length-3){
                result[map.get(nums[i])] = "Bronze Medal";
                continue;
            }
            result[map.get(nums[i])] = String.valueOf(nums.length-i);
        }
        return result;
 
    }

}
