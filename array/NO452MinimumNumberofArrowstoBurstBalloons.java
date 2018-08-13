package pers.jiahao.leetcode.array;

import java.util.Arrays;

public class NO452MinimumNumberofArrowstoBurstBalloons {
	 public int findMinArrowShots(int[][] points) {
	        if(points.length==0){
	            return 0;
	        }
	        Arrays.sort(points,(a,b)->a[1]-b[1]);
	        int result = 1;
	        int prev = points[0][1];
	        for(int i = 1;i<points.length;i++){
	            if(prev>=points[i][0]){
	                continue;
	            }
	            result++;
	            prev = points[i][1];
	        }
	        return result;
	        
	    }

}
