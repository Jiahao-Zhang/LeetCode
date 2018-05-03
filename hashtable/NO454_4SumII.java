package pers.jiahao.leetcode.hashtable;

import java.util.HashMap;

public class NO454_4SumII {
	 public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
	        HashMap<Integer,Integer> map = new HashMap<>();
	        for(int i = 0;i<C.length;i++){
	            for(int j = 0;j<D.length;j++){
	                if(map.containsKey(C[i]+D[j])){
	                    map.put(C[i]+D[j],map.get(C[i]+D[j])+1);
	                }else{
	                    map.put(C[i]+D[j],1);
	                }
	            }
	        }
	        int result = 0;
	        for(int i = 0;i<A.length;i++){
	            for(int j = 0;j<B.length;j++){
	                if(map.containsKey(-(A[i]+B[j]))){
	                    result+=map.get(-(A[i]+B[j]));
	                }
	            }
	        }
	        return result;
	        
	    }

}
