package pers.jiahao.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NO40CombinationSumII {
	 public List<List<Integer>> combinationSum2(int[] candidates, int target) {
	        List<List<Integer>> container = new ArrayList<>();
	        List<Integer> list = new ArrayList<>();
	        Arrays.sort(candidates);
	        backtrack(candidates,0,target,container,list);
	        return container;
	        
	    }
	    public void backtrack(int[] candidates, int startIndex, int remain, List<List<Integer>> container, List<Integer> list){
	        if(remain==0){
	            container.add(new ArrayList(list));
	            return;
	        }else if(remain<0){
	            return;
	        }else{
	            for(int i = startIndex;i<candidates.length;i++){
	                if(i>startIndex&&candidates[i]==candidates[i-1]){
	                    continue;
	                }
	                list.add(candidates[i]);
	                backtrack(candidates,i+1,remain-candidates[i],container,list);
	                list.remove(list.size()-1);
	            }
	        }
	    }

}
