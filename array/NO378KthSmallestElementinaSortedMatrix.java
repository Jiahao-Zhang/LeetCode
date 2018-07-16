package pers.jiahao.leetcode.array;

import java.util.Arrays;

public class NO378KthSmallestElementinaSortedMatrix {
	public int kthSmallest(int[][] matrix, int k) {
        int[] array = new int[matrix.length*matrix.length];
        int index = 0;
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix.length;j++){
                array[index] = matrix[i][j];
                index++;
            }
        }
        Arrays.sort(array);
        return array[k-1];
       
        
    }

}
