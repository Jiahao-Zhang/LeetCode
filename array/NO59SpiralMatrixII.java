package pers.jiahao.leetcode.array;

public class NO59SpiralMatrixII {
	public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int left = 0, right = n-1;
        int down = n-1, top = 0;
        int number = 1;
        while(left<=right){
            for(int i = left;i<=right;i++){
                result[top][i] = number;
                number++;
            }
            top++;
            for(int i = top;i<=down;i++){
                result[i][right] = number;
                number++;
            }
            right--;
            for(int i = right;i>=left;i--){
                result[down][i] = number;
                number++;
            }
            down--;
            for(int i = down;i>=top;i--){
                result[i][left] = number;
                number++;
            }
            left++;
        }
        return result;
       
        
    }

}
