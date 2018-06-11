package pers.jiahao.leetcode.math;

public class NO263UglyNumber {
	 public boolean isUgly(int num) {
	        if(num==1){
	            return true;
	        }
	        if(num<=0){
	            return false;
	        }
	        while(num!=1){
	            if(num%2==0){
	                num = num/2;
	            }else if(num%3==0){
	                num = num/3;
	            }else if(num%5==0){
	                num = num/5;
	            }else{
	                break;
	            }
	        }
	        if(num!=1){
	            return false;
	        }else{
	            return true;
	        }
	    }

}
