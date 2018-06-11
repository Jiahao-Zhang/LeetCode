package pers.jiahao.leetcode.math;

public class NO367ValidPerfectSquare {
	 public boolean isPerfectSquare(int num) {
	        if(num==1){
	            return true;
	        }
	        int left = 1;
	        int right = num/2+1;
	        while(right>=left){
	            long mid = (left+right)/2;
	            if(mid*mid==num){
	                return true;
	            }else if(mid*mid<num){
	                left = (int)mid+1;
	            }else{
	                right = (int)mid-1;
	            }
	        }
	        return false;
	    }

}
