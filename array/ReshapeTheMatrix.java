package pers.jiahao.leetcode.array;

public class ReshapeTheMatrix {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums.length*nums[0].length!=r*c){
            return nums;
        }else{
            int[][] result = new int[r][c];
            int[] temp = new int[r*c];
            int index = 0;
            for(int i = 0;i<nums.length;i++){
                for(int j = 0;j<nums[0].length;j++){
                    temp[index] = nums[i][j];
                    index++;
                }
            }
            index = 0;
            for(int i = 0;i<r;i++){
                for(int j = 0;j<c;j++){
                    result[i][j] = temp[index];
                    index++;
                }
            }
            return result;
        }   
    }

}
