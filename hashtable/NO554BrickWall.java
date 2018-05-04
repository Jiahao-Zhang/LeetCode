package pers.jiahao.leetcode.hashtable;

import java.util.HashMap;
import java.util.List;

public class NO554BrickWall {
	 public int leastBricks(List<List<Integer>> wall) {
	        int height = wall.size();
	        if(wall==null||height==0||wall.get(0).size()==0){
	            return 0;
	        }
	        HashMap<Integer,Integer> map = new HashMap<>();
	     
	        for(int i = 0;i<wall.size();i++){
	            int sum = 0;
	            for(int j = 0;j<wall.get(i).size()-1;j++){
	                sum+=wall.get(i).get(j);
	                map.put(sum,map.getOrDefault(sum,0)+1);
	            }
	        }
	        int max = 0;
	        for(int val:map.values()){
	            if(val>max){
	                max = val;
	            }
	        }
	        return height - max;
	        
	    }

}
