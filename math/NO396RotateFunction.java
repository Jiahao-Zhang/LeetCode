package pers.jiahao.leetcode.math;

public class NO396RotateFunction {
	public int maxRotateFunction(int[] A) {
        if(A==null||A.length==0){
            return 0;
        }
        int[] F = new int[A.length];
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<A.length;i++){
            int mid = i;
            int left = 0;
            int right = i+1;
            int index = 0;
            F[i] = index*A[mid];
            index++;
            while(right<A.length){
                F[i]+= index*A[right];
                right++;
                index++;
            }
            while(left<mid){
                F[i]+=index*A[left];
                left++;
                index++;
            }
            if(F[i]>max){
                max = F[i];
            }
        }
        return max;
        
    }

}
