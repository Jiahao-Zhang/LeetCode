package pers.jiahao.leetcode.array;

public class NO63UniquePathsII {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid==null||obstacleGrid.length==0||obstacleGrid[0].length==0){
            return 0;
        }
        for(int i = 0;i<obstacleGrid.length;i++){
            for(int j = 0;j<obstacleGrid[0].length;j++){
                if(obstacleGrid[i][j]==1){
                    obstacleGrid[i][j] = -1;
                }
            }
        }
        for(int j = 0;j<obstacleGrid[0].length;j++){
            if(obstacleGrid[0][j]==-1){
                break;
            }else{
                obstacleGrid[0][j] = 1;
            }
        }
        for(int i = 0;i<obstacleGrid.length;i++){
            if(obstacleGrid[i][0]==-1){
                break;
            }else{
                obstacleGrid[i][0] = 1;
            }
        }
        for(int i = 1;i<obstacleGrid.length;i++){
            for(int j = 1;j<obstacleGrid[0].length;j++){
                if(obstacleGrid[i][j]==-1){
                    continue;
                }
                if(obstacleGrid[i-1][j]!=-1&&obstacleGrid[i][j-1]!=-1){
                    obstacleGrid[i][j] = obstacleGrid[i-1][j]+obstacleGrid[i][j-1];
                }else if(obstacleGrid[i-1][j]!=-1&&obstacleGrid[i][j-1]==-1){
                    obstacleGrid[i][j] = obstacleGrid[i-1][j];
                }else if(obstacleGrid[i-1][j]==-1&&obstacleGrid[i][j-1]!=-1){
                    obstacleGrid[i][j] = obstacleGrid[i][j-1];
                }else{
                    obstacleGrid[i][j] = -1;
                }
            }
        }
        if(obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1]==-1){
            return 0;
        }else{
            return obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1];
        }
   
        
    }

}
