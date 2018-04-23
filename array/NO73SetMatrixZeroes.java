package pers.jiahao.leetcode.array;

import java.util.ArrayList;

public class NO73SetMatrixZeroes {
	 public void setZeroes(int[][] matrix) {
	        ArrayList<RowAndColumn> list = new ArrayList<>();
	        for(int i = 0;i<matrix.length;i++){
	            for(int j = 0;j<matrix[0].length;j++){
	                if(matrix[i][j]==0){
	                    list.add(new RowAndColumn(i,j));
	                }
	            }
	        }
	        for(int i = 0;i<list.size();i++){
	            int row = list.get(i).row;
	            int col = list.get(i).col;
	            for(int j = 0;j<matrix[0].length;j++){
	                matrix[row][j] = 0;
	            }
	            for(int j = 0;j<matrix.length;j++){
	                matrix[j][col] = 0;
	            }
	        }
	        
	    }
	    class RowAndColumn{
	        public int row;
	        public int col;
	        public RowAndColumn(int row, int col){
	            this.row = row;
	            this.col = col;
	        }
	    }

}
