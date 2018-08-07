package pers.jiahao.leetcode.math;

public class NO504Base7 {
	public String convertToBase7(int num) {
        if(num==0){
            return "0";
        }
        int number = Math.abs(num);
        StringBuffer buffer = new StringBuffer();
        while(number!=0){
            int bit = number%7;
            buffer.append(bit);
            number = number/7;
        }
        String result = buffer.reverse().toString();
        if(num<0){
            result = "-"+result;
        }
        return result;
        
    }

}
