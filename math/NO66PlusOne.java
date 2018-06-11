package pers.jiahao.leetcode.math;

public class NO66PlusOne {
	public int[] plusOne(int[] digits) {
        boolean ifPlusOne = true;
        for(int i = digits.length-1;i>=0;i--){
            if(ifPlusOne){
                digits[i]++;
                ifPlusOne = false;
            }
            if(digits[i]==10){
                digits[i]=0;
                ifPlusOne = true;
            }
        }
        if(!ifPlusOne){
            return digits;
        }else{
            int[] result = new int[digits.length+1];
            result[0] = 1;
            for(int i = 1;i<result.length;i++){
                result[i] = digits[i-1];
            }
            return result;
        }
    }

}
