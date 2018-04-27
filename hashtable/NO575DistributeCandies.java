package pers.jiahao.leetcode.hashtable;

import java.util.Arrays;

public class NO575DistributeCandies {
	 public int distributeCandies(int[] candies) {
	        if(candies==null||candies.length==0){
	            return 0;
	        }
	        Arrays.sort(candies);
//	        Map<Integer,Integer> map = new HashMap<>();
	        int kind = 1;
	        for(int i = 0;i<candies.length-1;i++){
	            // if(i==candies.length-1){
	            //     map.put(candies[i],count);
	            //     break;
	            // }
	            if(candies[i]==candies[i+1]){
	                continue;
	            }else{
	                kind++;
	            }
	        }
	        if(kind<=candies.length/2){
	            return kind;
	        }else{
	            return candies.length/2;
	        }
	        
	        
	        
	        
	    }

}
