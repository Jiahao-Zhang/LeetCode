package pers.jiahao.leetcode.array;

public class NO868TransposeMatrix {
	public int[][] transpose(int[][] A) {
        if(A.length==A[0].length){
            for(int i = 0;i<A.length;i++){
                for(int j = 0;j<i;j++){
                    int temp = A[i][j];
                    A[i][j] = A[j][i];
                    A[j][i] = temp;
                }
            }
            return A;
        }else{
            int[][] B = new int[A[0].length][A.length];
            for(int i = 0;i<A[0].length;i++){
                for(int j = 0;j<A.length;j++){
                    B[i][j] = A[j][i];
                }
            }
            return B;
        }
    }

}
