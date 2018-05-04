package pers.jiahao.leetcode.hashtable;

import java.util.ArrayList;
import java.util.HashMap;

public class NO599MinimumIndexSumofTwoLists {
	 public String[] findRestaurant(String[] list1, String[] list2) {
	        HashMap<String,Integer> map = new HashMap<>();
	        for(int i = 0;i<list1.length;i++){
	            map.put(list1[i],i);
	        }
	        ArrayList<String>[] list = new ArrayList[list1.length+list2.length+2];
	        for(int i = 0;i<list2.length;i++){
	            if(map.containsKey(list2[i])){
	                if(list[i+map.get(list2[i])]==null){
	                    list[i+map.get(list2[i])] = new ArrayList<String>();
	                }
	                list[i+map.get(list2[i])].add(list2[i]);
	            }
	        }
	        String[] result = null;
	        for(int i = 0;i<list.length;i++){
	            if(list[i]!=null){
	                result = new String[list[i].size()];
	                for(int j = 0;j<list[i].size();j++){
	                    result[j] = list[i].get(j);
	                }
	                break;
	            }
	        }
	        return result;  
	    }

}
