package pers.jiahao.leetcode.math;

public class NO883ProjectionAreaof3DShapes {
	public int projectionArea(int[][] grid) {
        int top = grid.length*grid.length;
        int left = 0;
        int right = 0;
        for(int i = 0;i<grid.length;i++){
            int max = grid[i][0];
            for(int j = 0;j<grid.length;j++){
                if(grid[i][j]==0){
                    top--;
                }
                max = Math.max(grid[i][j],max);
            }
            right+=max;
        }
        for(int i = 0;i<grid.length;i++){
            int max = grid[0][i];
            for(int j = 0;j<grid.length;j++){
                max = Math.max(max,grid[j][i]);
            }
            left+=max;
        }
        return left+right+top;
        
        
    }

}
