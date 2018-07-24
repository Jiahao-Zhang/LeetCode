package pers.jiahao.leetcode.math;

public class NO868BinaryGap {
	public int binaryGap(int N) {
        int length = 0;
        int now = 0;
        int last = -1;
        int number = N;
        while(number!=0){
            int bit = number%2;
            if(bit==1&&last!=-1){
                length = Math.max(length,now-last);
                last = now;
            }else if(bit==1){
                last = now;
            }
            now++;
            number = number/2;
        }
        return length;
    }

}
