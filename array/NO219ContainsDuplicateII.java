package pers.jiahao.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class NO219ContainsDuplicateII {
	 public boolean containsNearbyDuplicate(int[] nums, int k) {
	        if(nums==null||nums.length==0){
	            return false;
	        }
	        Map<Integer,Integer> map = new HashMap<>();
	        for(int i = 0;i<nums.length;i++){
	            if(!map.containsKey(nums[i])){
	                map.put(nums[i],i);
	            }else{
	                if(Math.abs(i-map.get(nums[i]))<=k){
	                    return true;
	                }else{
	                    map.remove(nums[i]);
	                    map.put(nums[i],i);
	                }
	            }
	        }
	        return false;
	    }

}
