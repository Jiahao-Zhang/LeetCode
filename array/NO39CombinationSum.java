package pers.jiahao.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class NO39CombinationSum {
	 public List<List<Integer>> combinationSum(int[] candidates, int target) {
	        List<List<Integer>> container = new ArrayList<>();
	        List<Integer> list = new ArrayList<>();
	        Arrays.sort(candidates);
	        backtrack(container,list,candidates,target,0);
	        return container;
	        
	    }
	    public void backtrack(List<List<Integer>> container, List<Integer> list, int[] candidates, int target, int startindex){
	        int sum = 0;
	        for(int i = 0;i<list.size();i++){
	            sum+=list.get(i);
	        }
	        if(sum==target){
	            container.add(new ArrayList(list));
	     //       list.remove(list.size()-1);
	            return;
	        }else if(sum>target){
	            return;
	        }else{
	            for(int i = startindex;i<candidates.length;i++){
	                list.add(candidates[i]);
	                backtrack(container,list,candidates,target,i);
	                list.remove(list.size()-1);
	            }
	        }       
	    }

}
