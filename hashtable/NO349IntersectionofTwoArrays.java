package pers.jiahao.leetcode.hashtable;

import java.util.ArrayList;
import java.util.HashMap;

public class NO349IntersectionofTwoArrays {
	 public int[] intersection(int[] nums1, int[] nums2) {
	        if(nums1==null||nums2==null||nums1.length==0||nums2.length==0){
	            return new int[]{};
	        }
	        HashMap<Integer,Boolean> map = new HashMap<>();
	        for(int i = 0;i<nums1.length;i++){
	            map.put(nums1[i],true);
	        }
	        ArrayList<Integer> list = new ArrayList<>();
	        for(int i = 0;i<nums2.length;i++){
	            if(map.containsKey(nums2[i])&&map.get(nums2[i])){
	                    list.add(nums2[i]);
	                    map.put(nums2[i],false);
	            }
	        }
	        int[] result = new int[list.size()];
	        for(int i = 0;i<list.size();i++){
	            result[i] = list.get(i);
	        }
	        return result; 
	    }

}
