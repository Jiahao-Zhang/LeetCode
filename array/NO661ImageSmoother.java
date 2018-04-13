package pers.jiahao.leetcode.array;

public class NO661ImageSmoother {
	public int[][] imageSmoother(int[][] M) {
        int[][] result = new int[M.length][M[0].length];
        for(int i = 0;i<M.length;i++){
            for(int j = 0;j<M[0].length;j++){
                int count = 1;
                int sum = M[i][j];
                if(i-1>=0){
                    count++;
                    sum+=M[i-1][j];
                    if(j-1>=0){
                        count++;
                        sum+=M[i-1][j-1];
                    }
                    if(j+1<M[0].length){
                        count++;
                        sum+=M[i-1][j+1];
                    }
                }
                if(i+1<M.length){
                    count++;
                    sum+=M[i+1][j];
                    if(j+1<M[0].length){
                        count++;
                        sum+=M[i+1][j+1];
                    }
                    if(j-1>=0){
                    count++;
                    sum+=M[i+1][j-1];
                }
                }
                if(j-1>=0){
                    count++;
                    sum+=M[i][j-1];
                }
                if(j+1<M[0].length){
                    count++;
                    sum+=M[i][j+1];
                }
                result[i][j] = sum/count;          
            }
        }
        return result;
    }

}
