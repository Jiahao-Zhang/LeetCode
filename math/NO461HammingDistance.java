package pers.jiahao.leetcode.math;

public class NO461HammingDistance {
	public int hammingDistance(int x, int y) {
        int count = 0;
        while(x!=0||y!=0){
            int temp1 = x%2;
            int temp2 = y%2;
            if(temp1!=temp2){
                count++;
            }
            x = x/2;
            y = y/2;
        }
        return count;
    }

}
