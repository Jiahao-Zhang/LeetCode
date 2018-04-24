package pers.jiahao.leetcode.array;

public class NO209MinimumSizeSubarraySum {
	  public int minSubArrayLen(int s, int[] nums) {
	        if(nums==null||nums.length==0){
	            return 0;
	        }
	        int left = 0;
	        int right = 0;
	        int sum = 0;
	        int count = 0;
	        int min = Integer.MAX_VALUE;
	        while(left<=right&&right<=nums.length){
	            if(sum>=s){
	                count = right-left;
	                if(count<min){
	                    min = count;
	                }
	                sum-=nums[left];
	                left++;
	            }else{
	                if(right==nums.length){
	                    break;
	                }
	                sum+=nums[right];
	                right++;
	            }
	        }
	        if(left==0&&right==nums.length&&sum<s){
	            return 0;
	        }else{
	            return min;
	        }
	        
	    }

}
