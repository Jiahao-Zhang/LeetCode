package pers.jiahao.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NO90SubsetsII {
	 public List<List<Integer>> subsetsWithDup(int[] nums) {
	        List<List<Integer>> container = new ArrayList<>();
	        List<Integer> list = new ArrayList<>();
	        Arrays.sort(nums);
	        backtrack(nums,0,container,list);
	        return container;
	        
	    }
	    public void backtrack(int[] nums, int startIndex,List<List<Integer>> container,List<Integer> list){
	        container.add(new ArrayList(list));
	        for(int i = startIndex;i<nums.length;i++){
	            if(i>startIndex&&nums[i]==nums[i-1]){
	                continue;
	            }
	            list.add(nums[i]);
	            backtrack(nums,i+1,container,list);
	            list.remove(list.size()-1);
	        }
	    }

}
