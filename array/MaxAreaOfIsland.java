package pers.jiahao.leetcode.array;

public class MaxAreaOfIsland {
	public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    max = Math.max(max,AreaOfIsland(grid,i,j));
                }
            }
        }
        return max;
        
    }
    public int AreaOfIsland(int[][] grid, int i, int j){
        if(i>=0&&i<grid.length&&j>=0&&j<grid[0].length&&grid[i][j]==1){
            grid[i][j] = 0;
            return 1+AreaOfIsland(grid,i-1,j)+AreaOfIsland(grid,i+1,j)+AreaOfIsland(grid,i,j-1)+AreaOfIsland(grid,i,j+1);
        }else{
            return 0;
        }
    }
}
