package pers.jiahao.leetcode.math;

public class NO553OptimalDivision {
	public String optimalDivision(int[] nums) {
        if(nums.length==0){
            return new String();
        }
        if(nums.length==1){
            return String.valueOf(nums[0]);
        }
        if(nums.length==2){
            return nums[0]+"/"+nums[1];
        }
        StringBuffer buffer = new StringBuffer();
        buffer.append(nums[0]+"/(");
        for(int i = 1;i<nums.length-1;i++){
            buffer.append(nums[i]+"/");
        }
        buffer.append(nums[nums.length-1]+")");
        return buffer.toString();
        
    }

}
