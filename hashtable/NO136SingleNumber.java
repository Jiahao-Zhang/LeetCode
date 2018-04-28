package pers.jiahao.leetcode.hashtable;

public class NO136SingleNumber {
	 public int singleNumber(int[] nums) {
	        int result = 0;
	        for(int i:nums){
	            result^=i;
	        }
	        return result;
	        
	    }

}
