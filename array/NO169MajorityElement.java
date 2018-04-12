package pers.jiahao.leetcode.array;

public class NO169MajorityElement {
	 public int majorityElement(int[] nums) {
	        int result = nums[0];
	        boolean[] isVisited = new boolean[nums.length];
	        int count = 0;
	        for(int i = 0;i<nums.length;i++){
	            if(!isVisited[i]){
	                for(int j = i;j<nums.length;j++){
	                    if(nums[j] == nums[i]){
	                        count++;
	                        isVisited[j] = true;
	                    }
	                }
	                if(count>nums.length/2){
	                    result = nums[i];
	                    break;
	                }
	            }
	        }
	        return result;
	        
	    }
}
