package pers.jiahao.leetcode.math;

public class NO400NthDigit {
	public int findNthDigit(int n) {
        int start = 1;
        long count = 9;
        int length = 1;
        while(n>count*length){
            n-=count*length;
            count*=10;
            length++;
            start*=10;
        }
        start = start+(n-1)/length;
        String s = Integer.toString(start);
		return Character.getNumericValue(s.charAt((n - 1) % length));
    }

}
