package pers.jiahao.leetcode.array;

public class NO697DegreeOfAnArray {
	public int findShortestSubArray(int[] nums) {
        int output = 50000;
        int max = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>=0){
                int count = 1;
                int index = i;
                for(int j = i+1;j<nums.length;j++){
                    if(nums[j]==nums[i]){
                        count++;
                        index = j;
                        nums[j] = -1;
                    }
                }
                if(count>max){
                    max = count;
                    output = index-i+1;
                }
                if(count==max&&index-i+1<output){
                    output = index-i+1;
                }
            }
        }
        return output;
        
    }
}
