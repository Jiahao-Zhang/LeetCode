package pers.jiahao.leetcode.array;

public class NO461HammingDistance {
	public int hammingDistance(int x, int y) {
        int count = 0;
        while(x!=0||y!=0){
            int x1 = x%2;
            int y1 = y%2;
            if(x1!=y1){
                count++;
            }
            x = x/2;
            y = y/2;
           
        }
        return count;
        
    }

}
