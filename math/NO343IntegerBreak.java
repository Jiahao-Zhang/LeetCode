package pers.jiahao.leetcode.math;

public class NO343IntegerBreak {
	 public int integerBreak(int n) {
	        if(n==2){
	            return 1;
	        }
	        if(n==3){
	            return 2;
	        }
	        if(n==4){
	            return 4;
	        }
	        int numOfThree = n/3;
	        int remainOfThree = n%3;
	        int numOfTwo = 1;
	        if(remainOfThree==2){
	            numOfTwo = 1;
	        }else if(remainOfThree==1){
	            numOfThree = numOfThree-1;
	            numOfTwo = 2;
	        }else{
	            numOfTwo = 0;
	        }
	        return (int)(Math.pow(3,numOfThree)*Math.pow(2,numOfTwo));  
	    }

}
