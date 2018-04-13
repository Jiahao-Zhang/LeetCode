package pers.jiahao.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class NO216CombinationSumIII {
	 public List<List<Integer>> combinationSum3(int k, int n) {
	        List<List<Integer>> container = new ArrayList<>();
	        List<Integer> list = new ArrayList<>();
	        int[] array = {1,2,3,4,5,6,7,8,9};
	        backtrack(container,list,array,k,n,0);
	        return container;
	    }
	    
	    public void backtrack(List<List<Integer>> container, List<Integer> list, int[] array, int k, int n, int startindex){
	        int sum = 0;
	        if(list.size()==k){
	            for(int i = 0;i<k;i++){
	                sum+=list.get(i);
	            }
	            if(sum==n){
	                container.add(new ArrayList(list));
	            }
	            return;
	        }else{
	            for(int i = startindex;i<array.length;i++){
	                list.add(array[i]);
	                backtrack(container,list,array,k,n,i+1);
	                list.remove(list.size()-1);
	            }
	        }
	    }

}
