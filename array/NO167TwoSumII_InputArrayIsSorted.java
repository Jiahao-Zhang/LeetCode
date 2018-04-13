package pers.jiahao.leetcode.array;

public class NO167TwoSumII_InputArrayIsSorted {
	 public int[] twoSum(int[] numbers, int target) {
	        int[] result = new int[2];
	        int right = numbers.length-1;
	        int left = 0;
	        while(left<right){
	            if(numbers[left]+numbers[right]==target){
	                result[0] = left+1;
	                result[1] = right+1;
	                break;
	            }
	            if(numbers[left]+numbers[right]>target){
	                right--;
	            }   
	            if(numbers[left]+numbers[right]<target){
	                left++;
	            }
	        }
	        return result;
	    }
}
