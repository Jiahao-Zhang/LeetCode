package pers.jiahao.leetcode.array;

public class NO11ContainerWithMostWater {
	 public int maxArea(int[] height) {
	        int area = 0;
		       int leftP = 0;
		       int rightP = height.length-1;
		       area = Math.min(height[leftP], height[rightP])*(rightP-leftP);
		       while(true){
	               if(leftP>=rightP){
	                   break;
	                }
		    	   if(height[leftP]>height[rightP]){
		    		   rightP--;
		    	   }else{
		    		   leftP++;
		    	   }
		    	   if(Math.min(height[leftP], height[rightP])*(rightP-leftP)>area){
		    		   area = Math.min(height[leftP], height[rightP])*(rightP-leftP);
		    	   }
		       }
		       return area;
	    }

}
