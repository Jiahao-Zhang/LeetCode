package pers.jiahao.leetcode.math;

public class NO397IntegerReplacement {
	public int integerReplacement(int n) {
        if(n>=Integer.MAX_VALUE){
            return 32;
        }
        int count = 0;
        int number = n;
        while(number!=1){
            if(number%2==0){
                number = number/2;
            }else{
                if((number+1)%4==0&&(number!=3)){
                    number++;
                }else{
                    number--;
                }
            }
            count++;
        }
        return count;
        
    }

}
