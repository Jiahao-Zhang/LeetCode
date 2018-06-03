package pers.jiahao.leetcode.math;

public class NO413ArithmeticSlices {
	 public int numberOfArithmeticSlices(int[] A) {
	        if(A==null||A.length==0){
	            return 0;
	        }
	        int start = 0;
	        int end = start+1;
	        int count = 0;
	        while(end<A.length){
	            while(end+1<A.length&&A[end+1]-A[end]==A[end]-A[end-1]){
	                end++;
	            }
	            for(int i = end-start-1;i>=1;i--){
	                count+=i;
	            }
	            start = end;
	            end++;
	        }
	        return count;
	    }

}
