package pers.jiahao.leetcode.array;

public class NO795NumberOfSubarraysWithBoundedMaximum {
	 public int numSubarrayBoundedMax(int[] A, int L, int R) {
	        int result = 0,count = 0;
	        int startIndex = 0;
	        for(int i = 0;i<A.length;i++){
	            if(A[i]>=L&&A[i]<=R){
	                count=i-startIndex+1;
	                result+=count;
	            }else if(A[i]<L){
	                result+=count;
	            }else{
	                startIndex = i+1;
	                count = 0;
	            }
	        }
	        return result; 
	    }

}
