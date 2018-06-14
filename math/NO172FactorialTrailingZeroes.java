package pers.jiahao.leetcode.math;

public class NO172FactorialTrailingZeroes {
	public int trailingZeroes(int n) {
        int fiveNumber = 0;
        while(n!=0){
            fiveNumber+=n/5;
            n = n/5;
        }
        return fiveNumber;
    }

}
