package pers.jiahao.leetcode.hashtable;

public class NO463IslandPerimeter {
	 public int islandPerimeter(int[][] grid) {
	        if(grid==null||grid.length==0||grid[0].length==0){
	            return 0;
	        }
	        int sum = 0;
	        for(int i = 0;i<grid.length;i++){
	            for(int j = 0;j<grid[i].length;j++){
	                int count = 4;
	                if(grid[i][j]==1){
	                    if(i-1>=0&&grid[i-1][j]==1){
	                        count--;
	                    }
	                    if(i+1<grid.length&&grid[i+1][j]==1){
	                        count--;
	                    }
	                    if(j+1<grid[i].length&&grid[i][j+1]==1){
	                        count--;
	                    }
	                    if(j-1>=0&&grid[i][j-1]==1){
	                        count--;
	                    }
	                    sum+=count;
	                }
	            }
	        }
	        return sum;
	        
	    }

}
