package pers.jiahao.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class NO78SubSets {
	 public List<List<Integer>> subsets(int[] nums) {
	        List<List<Integer>> container = new ArrayList<>();
	        List<Integer> list = new ArrayList<Integer>();
	        int startIndex = 0;
	        backtrack(startIndex,nums,list,container);
	        return container;
	        
	    }
	    public void backtrack(int startIndex,int[] nums, List<Integer> list, List<List<Integer>> container){
	        container.add(new ArrayList<>(list));
	        for(int i = startIndex;i<nums.length;i++){
	            list.add(nums[i]);
	            backtrack(i+1,nums,list,container);
	            list.remove(list.size()-1);
	        }
	        
	    }

}
