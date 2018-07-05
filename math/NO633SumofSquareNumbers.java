package pers.jiahao.leetcode.math;

public class NO633SumofSquareNumbers {
	public boolean judgeSquareSum(int c) {
        for(int i = 0;i<=(int)Math.sqrt(c);i++){
            int number = c-i*i;
            int temp = (int)Math.sqrt(number);
            if(temp*temp==number){
                return true;
            }
        }
        return false;
    }

}
