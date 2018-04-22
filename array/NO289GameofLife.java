package pers.jiahao.leetcode.array;

public class NO289GameofLife {
	 public void gameOfLife(int[][] board) {
	        int[][] oldboard = new int[board.length+2][board[0].length+2];
	        for(int i = 0;i<board.length;i++){
	            for(int j = 0;j<board[0].length;j++){
	                oldboard[i+1][j+1] = board[i][j];

	            }
	        }
	        for(int i = 0;i<board.length;i++){
	            for(int j = 0;j<board[0].length;j++){
	                int count = countLive(i+1,j+1,oldboard);
	    
	                if(count<2){
	                    board[i][j] = 0;
	                }else if(count>3){
	                    board[i][j] = 0;
	                }else if(count==3){
	                    board[i][j] = 1;
	                }else if(count==2){
	                    continue;
	                }
	                
	            }
	        }
	        
	        
	        
	    }
	    public int countLive(int i, int j, int[][] oldboard){
	        int count = 0;
	        for(int k = i-1;k<=i+1;k++){
	            for(int a = j-1;a<=j+1;a++){
	               
	                if(k==i&&a==j){
	                    continue;
	                }else{
	                    if(oldboard[k][a]==1){
	                        count++;
	                    }
	                }
	            }
	        }
	        return count;
	    }

}
