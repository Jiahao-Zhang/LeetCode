package pers.jiahao.leetcode.array;

public class NO88MergeSortedArray {
	  public void merge(int[] nums1, int m, int[] nums2, int n) {
	        int lastIndex = 0;
	        for(int i = 0;i<n;i++){
	            int j = 0;
	            for(j = lastIndex;j<m;j++){
	                if(nums2[i]<nums1[j]){
	                    for(int k = m;k>j;k--){
	                        nums1[k] = nums1[k-1];
	                    }
	                    nums1[j] = nums2[i];
	                    lastIndex = j;
	                    m++;
	                    break;
	                }
	            }
	            if(j==m){
	                int index = m;
	                for(int k = i;k<n;k++){
	                    nums1[index] = nums2[k];
	                    index++;
	                }
	                break;
	            }
	        }
	    }

}
