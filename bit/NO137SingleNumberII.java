package pers.jiahao.leetcode.bit;

public class NO137SingleNumberII {
	public int singleNumber(int[] nums) {
        int a = 0, b = 0;
        for(int c:nums){
            int ta = (a&~b&~c)|(~a&b&c);
            b = (~a&b&~c)|(~a&~b&c);
            a = ta;
        }
        return a|b;
        
    }

}
