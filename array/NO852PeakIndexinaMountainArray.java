package pers.jiahao.leetcode.array;

public class NO852PeakIndexinaMountainArray {
	public int peakIndexInMountainArray(int[] A) {
        int i = 0;
        while(A[i+1]>A[i]){
            i++;
        }
        return i;
    }

}
