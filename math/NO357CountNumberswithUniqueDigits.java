package pers.jiahao.leetcode.math;

public class NO357CountNumberswithUniqueDigits {
	public int countNumbersWithUniqueDigits(int n) {
        if(n==0){
            return 1;
        }
        int sum = 10;
        int base = 9;
        for(int i = 2;i<=n;i++){
            base = base*(9-i+2);
            sum+=base;
        }
        return sum;
    }

}
