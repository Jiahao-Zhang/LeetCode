package pers.jiahao.leetcode.math;

public class NO268MissingNumber {
	 public int missingNumber(int[] nums) {
	        int result = 0;
	        int index = 0;
	        boolean ifZeroAppear = false;
	        for(int i = 0;i<nums.length;i++){
	            index = Math.abs(nums[i]);
	            if(index!=0)
	                nums[index-1] = -nums[index-1];
	            else
	                ifZeroAppear = true;
	                
	        }
	        if(!ifZeroAppear){
	            return result;
	        }
	        for(int i = 0;i<nums.length;i++){
	            if(nums[i]==0)
	            {
	                index = i;
	            }else if(nums[i]>0){
	                result = i;
	                return result+1;
	            }
	                
	        }
	        result = index;
	        return result+1;
	        
	        
	    }

}
