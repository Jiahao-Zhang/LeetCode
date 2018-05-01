package pers.jiahao.leetcode.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class NO347TopKFrequentElements {
	 public List<Integer> topKFrequent(int[] nums, int k) {
	        HashMap<Integer,Integer> map = new HashMap<>();
	        List<Integer> result = new ArrayList<>();
	        for(int i = 0;i<nums.length;i++){
	            if(map.containsKey(nums[i])){
	                map.put(nums[i],map.get(nums[i])+1);
	            }else{
	                map.put(nums[i],1);
	            }
	        }
	        List<Integer>[] list = new ArrayList[nums.length+1];
	        Iterator<Map.Entry<Integer,Integer>> it = map.entrySet().iterator();
	        while(it.hasNext()){
	            Map.Entry<Integer,Integer> entry = it.next();
	            if(list[entry.getValue()]==null){
	                list[entry.getValue()] = new ArrayList<>();
	            }
	            list[entry.getValue()].add(entry.getKey());
	          
	        }
	        for(int i = nums.length;i>=0;i--){
	            if(k==0){
	                break;
	            }
	            if(list[i]!=null){
	               for(int j = 0;j<list[i].size();j++){
	                   result.add(list[i].get(j));
	                   k--;
	               }
	            }
	            
	        }
	        return result;
	        
	    }

}
