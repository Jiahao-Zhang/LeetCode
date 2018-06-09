package pers.jiahao.leetcode.math;

public class NO231PowerofTwo {
	public boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }
        boolean result = false;
        while(n!=1){
            if(n%2!=0){
                break;
            }
            n = n/2;
        }
        if(n==1){
            return true;
        }else{
            return false;
        }
	}

}
