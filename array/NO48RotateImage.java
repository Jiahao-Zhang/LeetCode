package pers.jiahao.leetcode.array;

public class NO48RotateImage {
	 public void rotate(int[][] matrix) {
	        for(int i = 0;i<matrix.length;i++){
	            for(int j = i;j<matrix.length;j++){
	                int temp = matrix[i][j];
	                matrix[i][j] = matrix[j][i];
	                matrix[j][i] = temp;
	            }
	        }
	        for(int i = 0;i<matrix.length/2;i++){
	            for(int j = 0;j<matrix.length;j++){
	                int temp = matrix[j][i];
	                matrix[j][i] = matrix[j][matrix.length-i-1];
	                matrix[j][matrix.length-i-1] = temp;
	                    
	            }
	        }
	        
	    }

}
