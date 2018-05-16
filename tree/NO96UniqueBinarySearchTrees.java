package pers.jiahao.leetcode.tree;

public class NO96UniqueBinarySearchTrees {
	public int numTrees(int n) {
        int[] number = new int[n+1];
        number[0] = 1;
        number[1] = 1;
        for(int i = 2;i<=n;i++){
            for(int j = 1;j<=i;j++){
                number[i]+= number[j-1]*number[i-j];
            }
        }
        return number[n];
        
    }

}
