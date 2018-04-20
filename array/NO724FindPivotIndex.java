package pers.jiahao.leetcode.array;

public class NO724FindPivotIndex {
	 public int pivotIndex(int[] nums) {
	        int index = -1;
	        if(nums.length==0){
	            return index;
	        }
	        int[] leftSum = new int[nums.length];
	        leftSum[0] = nums[0];
	        int[] rightSum = new int[nums.length];
	        rightSum[nums.length-1] = nums[nums.length-1];
	        for(int i = 1;i<nums.length;i++){
	            leftSum[i]=nums[i]+leftSum[i-1];
	        }
	        for(int i = nums.length-2;i>=0;i--){
	            rightSum[i] = nums[i]+rightSum[i+1];
	        }
	        for(int i = 0;i<nums.length;i++){
	            if(leftSum[i]-nums[i]==rightSum[i]-nums[i]){
	                index = i;
	                return index;
	            }
	        }
	        return index;
	    }

}
