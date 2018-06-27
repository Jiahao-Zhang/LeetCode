package pers.jiahao.leetcode.tp;

import java.util.HashMap;

public class NO532KdiffPairsinanArray {
	public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int key:map.keySet()){
            if(k==0){
                if(map.get(key)>1){
                    sum++;
                }
            }else if(k>0){
                if(map.containsKey(key+k)){
                    sum++;
                }
            }else{
                return 0;
            }
        }
        return sum;
        
    }

}
