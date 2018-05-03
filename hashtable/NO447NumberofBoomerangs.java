package pers.jiahao.leetcode.hashtable;

import java.util.HashMap;

public class NO447NumberofBoomerangs {
	 public int numberOfBoomerangs(int[][] points) {
	        if(points==null||points.length==0||points[0].length==0){
	            return 0;
	        }
	        HashMap<Integer,Integer> map = new HashMap<>();
	        int result = 0;
	        for(int i = 0;i<points.length;i++){
	            for(int j = 0;j<points.length;j++){
	                if(i==j){
	                    continue;
	                }
	                int distance = getDistance(points[i],points[j]);
	                map.put(distance,map.getOrDefault(distance,0)+1);
	            }
	            for(int val:map.values()){
	                result+=val*(val-1);
	            }
	            map.clear();
	        }
	        return result;
	    }
	    public int getDistance(int[] a, int[] b){
	        int x = a[0]-b[0];
	        int y = a[1]-b[1];
	        return x*x+y*y;
	    }

}
