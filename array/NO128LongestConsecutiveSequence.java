package pers.jiahao.leetcode.array;

import java.util.HashMap;

public class NO128LongestConsecutiveSequence {
	 public int longestConsecutive(int[] nums) {
	        int max = 0;
	        HashMap<Integer, Integer> map = new HashMap<>();
	        for(int i = 0;i<nums.length;i++){
	            if(!map.containsKey(nums[i])){
	                int left = 0;
	                if(map.containsKey(nums[i]-1)){
	                    left = map.get(nums[i]-1);
	                }
	                int right = 0;
	                if(map.containsKey(nums[i]+1)){
	                    right = map.get(nums[i]+1);
	                }
	                int length = right+left+1;
	                if(length>max){
	                    max = length;
	                }
	                map.put(nums[i],length);
	                map.put(nums[i]-left,length);
	                map.put(nums[i]+right,length);
	                
	            }else{
	                continue;
	            }
	        }
	        return max;
	    }

}
