package pers.jiahao.leetcode.array;

public class NO74SearchA2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if(m==0){
            return false;
        }
        int n = matrix[0].length;
        if(n==0){
            return false;
        }
        int row = 0;
        while(row<m){
            if(target>matrix[row][n-1]){
                row++;
            }else{
                break;
            }
        }
        if(row==m){
            return false;
        }else{
            int left = 0;
            int right = n-1;
            while(left<=right){
                int mid = (left+right)/2;
                if(target==matrix[row][mid]){
                    return true;
                }else if(matrix[row][mid]>target){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
            return false;
        }
        
    }

}
