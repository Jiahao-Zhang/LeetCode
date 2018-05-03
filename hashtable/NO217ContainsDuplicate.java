package pers.jiahao.leetcode.hashtable;

import java.util.HashMap;

public class NO217ContainsDuplicate {
	 public boolean containsDuplicate(int[] nums) {
	        if(nums==null||nums.length==0){
	            return false;
	        }
	        HashMap<Integer,Integer> map = new HashMap<>();
	        for(int i = 0;i<nums.length;i++){
	            if(map.containsKey(nums[i])){
	                return true;
	            }else{
	                map.put(nums[i],1);
	            }
	        }
	        return false;
	    }

}
